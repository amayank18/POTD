package Week3.DAY17;

public class arrangeCoins {
//    O(n)
//    public static int arrangeCoins(int n) {
//        int count=0,i=1;
//        while(n>=i) {
//            n-=i;
//            count++;
//            i++;
//        }
//        return count;
//    }

    //O(log n)
    public static int arrangeCoins(int n) {
        int start=0,end=n;
        while(start <= end) {
            int mid=start + (end-start)/2;
            if(n >= (mid*(mid+1))/2)
                start = mid+1;
            else
                end = mid - 1;
        }
        return start-1;
    }

    //O(1)
//    public static int arrangeCoins(int n) {
//        return (int)(Math.sqrt(2*(long)n+ 0.25) - 0.5);
//    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(arrangeCoins(n));
    }
}
