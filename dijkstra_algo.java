package DAAProject;

import java.util.*;
public class dijkstra_algo{
//0 -> A
//1 -> B
//'a' + integer;
    public static int min_vertex(boolean[] set, int[] dis) {
        int size = set.length;
        
        int min_index = 9;
        int min_dis = Integer.MAX_VALUE;
        for(int i = 0; i < size; i++) {
            // System.out.println("kfhkj");
            if(set[i] == false && min_dis > dis[i]) {
                min_dis = dis[i];
                min_index = i;
            }
        }
        return min_index;
    }
    
    public static void print_func(int dis[]) {
        int len = dis.length;
        
        for(int i = 0; i < len; i++) {
            System.out.println(i + "->" + dis[i]);
        } 
    }
    
    public int dijkstra_fun(Integer[][] graph, int src, int des) {
        
        boolean[] set = new boolean[graph.length];
        Arrays.fill(set, false);
        
        int[] dis = new int[graph.length];
        Arrays.fill(dis, Integer.MAX_VALUE);
        
        dis[src] = 0;
        // set[src] = true;
        
        for(int count = 0; count < graph.length-1; count++) {
            // print_func(dis);
            int u = min_vertex(set, dis);
            set[u] = true;
            
            for(int v = 0; v < graph.length; v++) {
                
                if(graph[u][v] != 0 && set[v] == false && 
                dis[u]!= Integer.MAX_VALUE && 
                dis[u]+graph[u][v] < dis[v]) {
                    dis[v] = dis[u]+graph[u][v];
                }
                
            }
            
        }
        print_func(dis);
        return dis[des];
//        dis[char-'A']
    }
    
//     public static void main(String []args){
//        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
//                                      { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
//                                      { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
//                                      { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
//                                      { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
//                                      { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
//                                      { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
//                                      { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
//                                      { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
//        dijkstra_fun(graph, 0);
//     }
}
