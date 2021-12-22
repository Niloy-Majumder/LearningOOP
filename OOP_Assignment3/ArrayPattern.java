public class ArrayPattern {
    public static void main(String[] args) {
        int[][] A={{1},{1,0},{1,0,1},{1,0,1,0}};
        int i,j;
        for(i=0;i<A.length;i++){
            for(j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
