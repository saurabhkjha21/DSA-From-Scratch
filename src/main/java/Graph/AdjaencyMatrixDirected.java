//Adjaency Matrix


import java.util.*;
class Main {
    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {{0,1},{1,2}, {2,0}};
        
        ArrayList<ArrayList<Integer>> mat = createMatrix(V, edges);
        
        System.out.println("Adjaency Matrix: ");
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(mat.get(i).get(j)+" ");
            }
            System.out.println();
        }
        

    }
    static ArrayList<ArrayList<Integer>> createMatrix(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
        
        //initailize matrix
        
        for(int i=0; i<V; i++){
            ArrayList<Integer> row = new ArrayList<>(Collections.nCopies(V, 0));
            mat.add(row);
        }
        //add edges to matrix
        for(int[] it : edges){
            int u = it[0];
            int v = it[1];
            
            mat.get(u).set(v,1);//directed 
        }
        return mat;
    }
}
