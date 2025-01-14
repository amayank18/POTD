package Week4.DAY23;

public class paintersPartition {
    public int minTime(int[] arr, int k) {
        // code here
        int start=0, end=0;
        for(int i=0;i<arr.length;i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end) {
            int mid=start+(end-start)/2;
            int sum=0,pieces=1;
            for(int i=0;i<arr.length;i++) {
                if(sum+arr[i]>mid) {
                    sum=arr[i];
                    pieces++;
                }
                else {
                    sum+=arr[i];
                }
            }
            if(pieces>k) {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;
    }
}
