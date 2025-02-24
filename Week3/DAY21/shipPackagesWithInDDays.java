package Week3.DAY21;

class shipPackagesWithInDDays {

    public static int req(int[] weights,int capacity) {
        int sum=0,days=1;
        for (int i = 0; i < weights.length; i++) {
            if(sum+weights[i] > capacity) {
                days++;
                sum=weights[i];
            }
            else {
                sum+=weights[i];
            }
        }
        return days;
    }

    public static int shipWithinDays(int[] weights, int days) {
        int start=Integer.MIN_VALUE;
        int end=0;
        for(int i=0;i<weights.length;i++) {
            start=Math.max(start,weights[i]);
            end+=weights[i];
        }
//        for (int capacity = start; capacity < sum; capacity++) {
//            int reqDays=req(weights,capacity);
//            if(reqDays <= days) {
//                return capacity;
//            }
//        }

        while(start <= end) {
            int mid=start + (end - start)/2;
            int reqDays=req(weights,mid);
            if(reqDays <= days) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return end+1;
    }

    public static void main(String[] args) {
//        int[] weights = {1,2,3,4,5,6,7,8,9,10};
//        int days = 5;
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights,days));
    }
}