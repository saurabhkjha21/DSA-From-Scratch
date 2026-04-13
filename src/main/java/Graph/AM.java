//Basic Adjaency matrix Representation 

class Main {
    public static void main(String[] args) {
        int V=  3;
        int[][] mat = new int[V][V];
        
        //add edges
        addEdges(mat,0,1);
        addEdges(mat,1,2);
        
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void addEdges(int[][] mat, int u, int v){
        mat[u][v]=1;
        mat[v][u]=1;//undirected
    }
}
