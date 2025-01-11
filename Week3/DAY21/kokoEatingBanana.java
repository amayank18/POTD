package Week3.DAY21;

public class kokoEatingBanana {
    public static int hours(int[] piles , int hour) {
        int hours = 0;
        for(int i=0;i<piles.length;i++) {
            if(piles[i]%hour==0) {
                hours+=piles[i]/hour;
            }
            else {
                hours+=piles[i]/hour+1;
            }
        }
        return hours;
    }

    public static int max(int[] piles) {
        int max=Integer.MIN_VALUE;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return max;
    }

    //O(n^2)
//    public static int minEatingSpeed(int[] piles, int h) {
//        int max=max(piles);
//        for (int i = 1; i <= max; i++) {
//            int req=hours(piles, i);
//            if(req <= h) {
//                return i;
//            }
//        }
//        return max;
//    }

    public static int binarySearch(int[] piles, int h) {
        int start=1,end=max(piles);
        while(start <= end) {
            int mid=start + (end - start)/2;
            int totalHours=hours(piles,mid);
            if(totalHours <= h) {
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return start;
    }

    //O(n log max)
    public static int minEatingSpeed(int[] piles, int h) {
        return binarySearch(piles,h);
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        //int[] piles = {30,11,23,4,20};
        int h = 8;
        //int h = 5;
        System.out.println(minEatingSpeed(piles,h));
    }
}
