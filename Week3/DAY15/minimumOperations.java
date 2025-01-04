package Week3.DAY15;

import java.util.Arrays;

public class minimumOperations {
    //brute force
//    public static int[] minOperations(String boxes) {
//        int[] result=new int[boxes.length()];
//        for(int i=0;i<boxes.length();i++) {
//            for(int j=0;j<boxes.length();j++) {
//                if(i!=j && boxes.charAt(j) == '1')
//                    result[i]+=Math.abs(i-j);
//            }
//        }
//        return result;
//    }

    //
    public static int[] minOperations(String boxes) {
        int[] result=new int[boxes.length()];
        int travel = 0, ones = 0;
        for(int i=0;i<boxes.length();i++) {
            travel+=ones;
            result[i]+=travel;
            if(boxes.charAt(i)=='1')
                ones++;
        }
        travel=0;
        ones=0;
        for(int i=boxes.length()-1;i>=0;i--) {
            travel+=ones;
            result[i]+=travel;
            if(boxes.charAt(i)=='1')
                ones++;
        }
        return result;
    }

    public static void main(String[] args) {
        String boxes="110";
        System.out.print(Arrays.toString(minOperations(boxes)));
    }
}
