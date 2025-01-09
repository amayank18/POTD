package Week3.DAY19;

public class minimumInRotatedSortedArray {
    public static int findMin(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<end) {
            if(nums[start] < nums[end])
                return nums[start];
            int mid=start+(end-start)/2;
            if(nums[mid] > nums[end])
                start=mid+1;
            else
                end=mid;
        }
        return nums[start];
    }

    public static void main(String[] args) {
        //int[] nums={3,4,5,1,2};
        //int[] nums={4,5,6,7,0,1,2};
        int[] nums={11,13,15,17};
        //int[] nums={-19,-1,0,17};
        //int[] nums={10, 11, 12, 2, 3, 4, 5};
        System.out.println(findMin(nums));
    }
}
