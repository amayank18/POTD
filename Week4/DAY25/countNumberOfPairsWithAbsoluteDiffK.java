package Week4.DAY25;

public class countNumberOfPairsWithAbsoluteDiffK {
    public static int countKDifference(int[] nums, int k) {
        int count=0;
        int i=0,j=nums.length-1;
        while(i<j) {
            if(Math.abs(nums[i]-nums[j])==k) {
                count++;
            }
            j--;
            if(i==j) {
                i++;
                j=nums.length-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,2,1};
//        int k = 1;
//        int[] nums = {3,2,1,5,4};
//        int k = 2;
        int[] nums = {1,3};
        int k = 3;
        System.out.println(countKDifference(nums,k));
    }
}
