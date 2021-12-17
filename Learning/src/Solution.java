// class Solution {
//     public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
//         int color= image[sr][sc];
//         int numberOfColumns = image.length;
//         int numberOfRows = image[0].length;
//         int[][] isVisited = new int[numberOfColumns][numberOfRows];
//         fill(image,isVisited,sr,sc,newColor,color);
//         return image;
//     }
//     public static int[][] fill(int[][] image,int[][] isVisited,int i,int j,int nwc,int c){
//         if(image[i][j]!=c){
//             return image;
//         }
//         else {

//             image[i][j]=nwc;
//             isVisited[i][j]=1;
//             int numberOfColumns = image.length;
//             int numberOfRows = image[0].length;
//             if((j-1)>=0 && isVisited[i][j-1]!=1){
//                 fill(image,isVisited,(i),(j-1),nwc,c);
//             }
//             if((i-1)>=0 && isVisited[i-1][j]!=1){
                
//                 fill(image,isVisited,(i-1),(j),nwc,c);
//             }
//             if(i+1<numberOfColumns){
                
//                 fill(image,isVisited,(i+1),(j),nwc,c);
//             }
//             if(j+1<numberOfRows){
//                 fill(image,isVisited,(i),(j+1),nwc,c);
//             }
//             return image;
//         }
//     }
//     public static void main(String[] args) {
//         // Solution S= new Solution();
//         int[][] arr={{0,0,0},{0,1,1}};
//         floodFill(arr, 1, 1, 1);
//         for (int i=0;i<2;i++) {
//             for (int j = 0; j <3; j++) {
//                 System.out.print(arr[i][j]);
//             }
//             System.out.println("");
            
//         }
        
//     }
// }

class Solution {
    public static int maxAreaOfIsland(int[][] grid) {
        int numberofRows=grid.length, numberofColumns=grid[0].length,i=0,j=0,sum=0;
        int[][] check = new int[numberofRows][numberofColumns];
        for(i=0;i<numberofRows;i++){
            for(j=0;j<numberofColumns;j++){
                if(grid[i][j]==1 && check[i][j]!=1){
                    sum=Math.max(dfs(grid,i,j),sum);
                }
            }
        }
        return sum;
    }
    public static int dfs(int[][] grid,int i, int j){
        int result=1;
        if(i<0 || j<0 ||i==grid.length||j==grid[0].length|| grid[i][j]==0){
            return 0;
        }
        // check[i][j]=1;
        grid[i][j]=0;
        result+=dfs(grid,i-1,j);
        result+=dfs(grid,i,j-1);
        result+=dfs(grid,i+1,j);
        result+=dfs(grid,i,j+1);
        
        return result;
    }
    public static void main(String[] args) {
        int[][] arr={{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int res=maxAreaOfIsland(arr);
        System.out.println(res);

    }
}