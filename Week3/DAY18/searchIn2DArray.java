package Week3.DAY18;

public class searchIn2DArray {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0,c=matrix[r].length-1;
        while(r<matrix.length && c>=0) {
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] < target)
                r++;
            else
                c--;
        }
        return false;
    }
}
