package leetCode;

import java.util.Arrays;

public class UniquePathII {
	public static void main(String[] args){
		int[][] obstacleGrid = new int[][]{{0,0},{1,1},{0,0}};
		System.out.println(uniquePathsWithObstacles(obstacleGrid));
	}
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        for (int i=0;i<obstacleGrid.length;i++){
            for (int j=0;j<obstacleGrid[0].length;j++){
//            	System.out.println(Arrays.toString(obstacleGrid[0]));
//            	System.out.println(Arrays.toString(obstacleGrid[1]));
//            	System.out.println(Arrays.toString(obstacleGrid[2]));
//            	System.out.println();
            	if (i==0 && j==0){
                    if (obstacleGrid[i][j]==1){
                        return 0;
                    }
                    else{
                    	obstacleGrid[i][j] = 1;
                    }	
            	}

            	else{
	                if (obstacleGrid[i][j]==1){
	                    obstacleGrid[i][j] = 0;
	                    continue;
	                }
	                if (i==0){
	                    obstacleGrid[i][j] = obstacleGrid[i][j-1];
	                    continue;
	                }
	                if (j==0){
	                	obstacleGrid[i][j] = obstacleGrid[i-1][j];
	                    continue;
	                }
	                
	                obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];

            	}
                

            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}
