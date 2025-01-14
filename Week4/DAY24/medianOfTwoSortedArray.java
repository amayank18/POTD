package Week4.DAY24;

import java.util.Arrays;

public class medianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length+nums2.length;
        int[] a=new int[n];
        for(int i=0;i<nums1.length;i++){
            a[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++)
            a[nums1.length+i]=nums2[i];
        Arrays.sort(a);
        int m=n/2;
        if(n%2==0) {
            return (double)(a[m-1]+a[m])/2;
        }
        return (double)(a[m]);
    }
}
