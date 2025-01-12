package Week4.DAY22;

import java.util.Arrays;

public class aggresiveCows {

    public static boolean canWePlace(int[] stalls, int k, int dist) {
        int count=1,last=stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if(stalls[i]-last>=dist) {
                count++; 
                last=stalls[i];
            }
        }
        if(count>=k) {
             return true;
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int ans=-1;


        //linear search
//        for(int i = 1; i <= stalls[stalls.length-1] - stalls[0]; i++) {
//            if(canWePlace(stalls,k,i)) {
//                continue;
//            }
//            else {
//                return i-1;
//            }
//        }

        //binary search
        int start=0,end=stalls[stalls.length-1] - stalls[0];
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(canWePlace(stalls,k,mid)) {
                ans=mid;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        int[] stalls={1, 2, 4, 8, 9};
//        int k=3;
        int[] stalls={10, 1, 2, 7, 5};
        int k=3;
//        int[] stalls={2, 12, 11, 3, 26, 7};
//        int k=5;
        System.out.println(aggressiveCows(stalls,k));
    }
}
