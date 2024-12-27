package DAY7;

import java.util.HashSet;
import java.util.Scanner;

public class happyNumber {

    public static int check(int n) {
        int sum=0;
        while(n>0) {
            int i=n%10;
            sum+=i*i;
            n/=10;
        }
        return sum;
    }
    public static boolean isHappy(int n) {
        HashSet<Integer> st = new HashSet<>();
        while (true) {
            n = check(n);
            if (n == 1)
                return true;
            if (st.contains(n))
                return false;
            st.add(n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isHappy(n));
    }
}
