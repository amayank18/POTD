package Week3.DAY20;

public class searchInRotatedSortedArrayII {
    public static boolean search(int[] nums, int target) {
        //O(n)
        for(int i=0;i<nums.length;i++) {
            if(target==nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={2,5,6,0,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
}
