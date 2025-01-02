package Week2.DAY8;

public class array1DTo2D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length)
            return new int[0][0];
        int index=0;
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                ans[i][j]=original[index++];
            }
        }
        return ans;
    }
}
