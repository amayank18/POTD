package Week2.DAY13;

import java.util.Arrays;

public class citySkyLine {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid.length];
        int sum=0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid.length;j++) {
                if(rowMax[i]<grid[i][j])
                    rowMax[i]=grid[i][j];
                if(colMax[j]<grid[i][j])
                    colMax[j]=grid[i][j];
            }
        }

        for(int i=0;i<grid.length;i++) {
            for (int j = 0; j < grid.length; j++) {
                sum+=Math.min(rowMax[i],colMax[j])-grid[i][j];
            }
        }

        System.out.println(Arrays.toString(rowMax));
        System.out.println(Arrays.toString(colMax));
        return sum;
    }

    public static void main(String[] args) {
//        int[][] arr={
//                {3,0,8,4},
//                {2,4,5,7},
//                {9,2,6,3},
//                {0,3,1,0}
//        };
        int[][] arr={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        System.out.println(maxIncreaseKeepingSkyline(arr));
    }
}
