package Week4.DAY22;

public class bookAllocation {
    public static int countStudent(int[] arr,int pages) {
        int students=1,pagesCount=0;
        for(int i=0;i<arr.length;i++) {
            if(pagesCount+arr[i] <= pages) {
                pagesCount += arr[i];
            }
            else {
                students++;
                pagesCount=arr[i];
            }
        }
        return students;
    }

    public static int linearSearch(int[] arr,int k, int max, int sum) {
        for(int i=max;i<=sum;i++) {
            if(countStudent(arr,i) == k)
                return i;
        }
        return max;
    }

    public static int binarySearch(int[] arr,int k, int max, int sum) {
        int ans=0;
        while(max<=sum) {
            int mid=max + (sum-max)/2;
            if(countStudent(arr,mid)==k) {
                ans=mid;
                sum=mid-1;
            }
            else if(countStudent(arr,mid)>=k)
                max=mid+1;
            else
                sum=mid-1;
        }
        return max;
    }

    public static int findPages(int[] arr, int k) {

        if(k>arr.length)
            return -1;

        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
            sum+=arr[i];
        }

        //linear search
        //return linearSearch(arr,k,max,sum);
        //binary search
        return binarySearch(arr,k,max,sum);

    }
    public static void main(String[] args) {
//        int[] arr={12, 34, 67, 90};
//        int k=2;
//        int[] arr={15, 17, 20};
//        int k=5;
        int[] arr={15, 10, 19, 10, 5, 18, 7};
        int k=5;
        System.out.println(findPages(arr,k));
    }
}
