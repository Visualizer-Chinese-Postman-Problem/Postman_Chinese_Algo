package DAAProject;

import java.util.*;
import java.util.Scanner;

public class Graph {
	public Integer[][] graph;
	private int n;
	Scanner sc = new Scanner(System.in);
	
	Graph(int n) {
		this.n = n;
//		System.out.print('a');
		graph = new Integer[n][n];
//		System.out.print(n);
		for(int i = 0; i < n; i++) {
			Arrays.fill(graph[i], 0);
		}
		this.input();
		
	}
	
	public void input() {
//		System.out.print('c');
		
		for(int i = 0; i < n; i++) {
//			System.out.print('d');
			System.out.println("Write number of nodes attached to " + (char)(i+'A') + " nodes : ");
			int count = sc.nextInt();
			System.out.println("Write nodes connected to" +(char)(i+'A')+" : ");
			for(int j = 0; j < count; j++) {
				char store = (sc.next().charAt(0));
				int w = sc.nextInt();
				graph[store-'A'][i] = w;
				graph[i][store-'A'] = w;
			}
		}
		
//		for(int i = 0; i < n; i++) {
//			System.out.println(Arrays.deepToString(graph[i]));
//		}
	}
	
}
