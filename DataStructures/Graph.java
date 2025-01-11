import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    public static void main(String[] args) {
        int v = 5;
        int e = 10;

        int a[][] = new int[v+1][v+1];

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0; i<= v; i++){
            adj.add(new ArrayList<Integer>());
        }

    }

    static void addEdge(int a[][], int source, int destination){
        a[source][destination] = 1;
        a[destination][source] = 1;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination){
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

//    public static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int[] pred, int dis[]){
//
//        LinkedList<Integer> queue = new LinkedList<>();
//        boolean visited[] = new boolean[v];
//
//        for(int i = 0; i< v; i++){
//            dis[i] = Integer.MAX_VALUE;
//            pred[i] = -1;
//            visited[i] = false;
//        }
//
//        visited[src] = true;
//        dis[src] = 0;
//        queue.add(src);
//        while(!queue.isEmpty()){
//            int cur = queue.remove();
//            for(int i =0; i< adj.get(cur).size(); i++){
//                int neighbour = adj.get(cur).get(i);
//                if(!visited[neighbour]){
//                    visited[neighbour] = true;
//                    dis[neighbour] = dis[cur]+1;
//                    pred[neighbour]=cur;
//                    queue.add(neighbour);
//                    if (neighbour==dest){
//                        return true;
//                    }
//                }
//            }
//        }
//
//        return false;
//    }



    static boolean bfs(ArrayList<ArrayList<Integer>> adj, int src, int dest, int v, int[] predi, int[] distance){

        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[v];

        for(int i = 0; i< v; i++){
            visited[i]  = false;
            predi[i] = -1;
            distance[i]= Integer.MAX_VALUE;
        }
        visited[src] = true;
        distance[src] = 0;
        queue.add(src);
        while(!queue.isEmpty()){
            int curr = queue.remove();
            for(int i = 0; i< adj.get(curr).size(); i++) {
                int neighbour = adj.get(curr).get(i);
                if(visited[neighbour] == false){
                    visited[neighbour] = true;
                    predi[neighbour] = curr;
                    distance[neighbour]= distance[curr]+1;
                    if(neighbour==dest){
                        return true;
                    }
                }
            }
        }

        return false;
    }

}
