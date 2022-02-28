package DAAProject;
import java.util.*;

public class Main {

	public static void main(String[] args) {
//		ArrayList<Character> odd = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F'));
//		Chinese_Postman_algo c = new Chinese_Postman_algo();
//		c.gen_pair(odd);
//		Graph g = new Graph(5);
		Integer[][] arr = {{0, 3, 1, 0, 5, 0}, 
	                        {3, 0, 0, 1, 0, 6}, 
	                        {1, 0, 0, 0, 2, 0}, 
	                        {0, 1, 0, 0, 0, 1}, 
	                        {5, 0, 2, 0, 0, 4}, 
	                        {0, 6, 0, 1, 4, 0}, 
	                         
	}; 
		Chinese_Postman_algo c = new Chinese_Postman_algo(arr);
	}
}
