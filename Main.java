package DAAProject;
import java.util.*;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Character> odd = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
//		Chinese_Postman_algo c = new Chinese_Postman_algo();
//		c.gen_pair(odd);
//		Graph g = new Graph(5);
		Integer[][] arr = {{0, 4, 0, 0, 0, 0, 0, 8, 0}, 
		                                           {4, 0, 8, 0, 0, 0, 0, 11, 0}, 
		                                           {0, 8, 0, 7, 0, 4, 0, 0, 2}, 
		                                           {0, 0, 7, 0, 9, 14, 0, 0, 0}, 
		                                           {0, 0, 0, 9, 0, 10, 0, 0, 0}, 
		                                           {0, 0, 4, 0, 10, 0, 2, 0, 0}, 
		                                           {0, 0, 0, 14, 0, 2, 0, 1, 6}, 
		                                           {8, 11, 0, 0, 0, 0, 1, 0, 7}, 
		                                           {0, 0, 2, 0, 0, 0, 6, 7, 0}
	}; 
		Chinese_Postman_algo c = new Chinese_Postman_algo(arr);
	}
}
