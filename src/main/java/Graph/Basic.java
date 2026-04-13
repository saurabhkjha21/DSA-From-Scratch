// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        int V=  3;
        int[][] mat = new int[V][V];
        
        // mat[0][0]=0;
        mat[0][1]=1;
        // mat[0][2]=0;
        
        // mat[1][1]=0;
        mat[1][0]=1;
        mat[1][2]=1;
        
        // mat[2][0]=0;
        mat[2][1]=1;
        // mat[2][2]=0;
        
        for(int i=0; i<V; i++){
            for(int j=0; j<V; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }
}
