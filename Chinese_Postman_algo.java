package DAAProject;

import java.util.ArrayList;

public class Chinese_Postman_algo {
	
	private dijkstra_algo di;
	private Integer[][] g;
	private ArrayList<ArrayList<String>> pairing_sum;
	private ArrayList<Character> odd = new ArrayList<>();
	private int len;
	
	Chinese_Postman_algo(Integer[][] g1) {
		g = g1;
		pairing_sum = new ArrayList<ArrayList<String>>();
		di = new dijkstra_algo();
		len = g.length;
		odd_vertices();
		gen_pair();
	}
	
	public ArrayList<ArrayList<String>> gen_pair() {
		
		ArrayList<ArrayList<String>> pairs = new ArrayList<ArrayList<String>>();
		int len = odd.size();
		
		for(int i = 0; i < len-1; i++) {
			ArrayList<String> tmp = new ArrayList<String>();
			for(int j = i+1; j < len; j++) {
				tmp.add(""+odd.get(i)+odd.get(j));
			}
			pairs.add(tmp);
		}
//		print_func(pairs);
		ArrayList<Character> done = new ArrayList<Character>();
		ArrayList<String> last = new ArrayList<String>();
		get_pair(pairs, (pairs.size()+1)/2, 0, done, last);
		
		print_func(pairing_sum);
		
		return pairs;
		
	}
	
	public void odd_vertices() {
		
		for(int i = 0; i < len; i++) {
			int count = 0;
			for(int j = 0; j < len; j++) {
				if(g[i][j] != 0) {
					count++;
				}
			}
			
			if(count%2 != 0) {
				odd.add((char)(i+'A'));
			}
		}
	}
	
	public void dis() {
		int min_ind = -1;
		int min_sum = Integer.MAX_VALUE;
		for(int i = 0; i < pairing_sum.size(); i++) {
			int sum = 0;
			for(int j = 0; j < pairing_sum.get(0).size(); j++)
			sum += di.dijkstra_fun(g, (int)(pairing_sum.get(i).get(j).charAt(0)-'A'), (int)(pairing_sum.get(i).get(0).charAt(1)-'A'));
//			sum += di.dijkstra_fun(g, (int)(pairing_sum.get(i).get(0).charAt(0)-'A'), (int)(pairing_sum.get(i).get(0).charAt(1)-'A'));
			
			if(sum < min_sum) {
				min_sum = sum;
				min_ind = i;
			}
		}
	}
	
	public void get_pair(ArrayList<ArrayList<String>> pairs, int l, int start_index, ArrayList<Character> done, ArrayList<String> last) {
		ArrayList<String> tmp = pairs.get(start_index);
		char c = tmp.get(0).charAt(0);
		boolean flag = false;
		for(int i = 0; i < done.size(); i++) {
			if(done.get(i) == c) {
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			done.add(c);
			
			for(int i = 0; i < tmp.size(); i++) {
				ArrayList<String> lst = new ArrayList<>(last);
				ArrayList<Character> val = new ArrayList<>(done);
				boolean flag1 = false;
				for(int j = 0; j < val.size(); j++) {
					if(tmp.get(i).charAt(1) == (val).get(j)) {
						flag1 = true;
						break;
					}
				}
				
				if(flag1 == false) {
					lst.add(tmp.get(i));
				} else {
					continue;
				}
				
				if(lst.size() == l) {
					pairing_sum.add(lst);
					return;
				} else {
					val.add(tmp.get(i).charAt(1));
					get_pair(pairs, l, start_index+1, val, lst);
				}
				
			}
			
		}else {
			get_pair(pairs, l, start_index+1, done, last);
		}
	}
	
	public void print_func(ArrayList<ArrayList<String>> pair) {
		int len = pair.size();
		for(int i = 0; i < len; i++) {
			System.out.println(pair.get(i).toString());
		}
	}
}
