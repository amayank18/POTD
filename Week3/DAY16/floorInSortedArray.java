package Week3.DAY16;

public class floorInSortedArray {
    static int findFloor(int[] arr, int target) {
        // write code here
        int start=0,end=arr.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start = mid + 1;
            else if(arr[mid]>target)
                end = mid - 1;
        }
        return end;
    }
}
