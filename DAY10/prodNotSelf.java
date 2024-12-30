package DAY10;

import java.util.Arrays;

public class prodNotSelf {
//    public static int[] productExceptSelf(int[] nums) {
//        int n= nums.length;
//        int[] ans = new int[n];
//        int prodL = 1;
//        int prodR = 1;
//        for (int i=n-1;i>-1;i--){
//            ans[i] = prodR;
//            prodR = prodR * nums[i];
//        }
//        for (int i=0;i<nums.length;i++){
//            ans[i] = prodL *  ans[i];
//            prodL = prodL * nums[i];
//        }
//        return ans;
//    }
    public static int[] productExceptSelf(int[] nums) {
        int[] mul=new int[nums.length];
        int x=1,y=1,count=0;
        for(int i=0;i<nums.length;i++) {
            x*=nums[i];
            if(nums[i]!=0)
                y*=nums[i];
            else
                count++;
        }
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0)
                mul[i]=x/nums[i];
            else if(count==nums.length)
                mul[i]=0;
            else if(nums[i]==0 && count<2)
                mul[i]=y;
        }
        return mul;
    }

    public static void main(String[] args) {
        int[] arr={-1,1,0,-3,3};
        System.out.print(Arrays.toString(productExceptSelf(arr)));
    }
}
