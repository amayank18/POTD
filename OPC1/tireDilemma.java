
import java.util.Scanner;

public class tireDilemma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            long n=sc.nextLong();
//            if(n%4==0 && n%6!=0) {
//                    System.out.println(Math.max(n/4,n/6) + " " + n/4);
//            }
//            else if(n%6==0 && n%4 != 0)
//                System.out.println(n/6+" "+n/4);
//            else if(n % 6 == 0)
//                System.out.println(n/6 + " " + n/4);
//            else
//                System.out.println(-1);
            if(n%2==1) {
                System.out.println(-1);
            }
            else if(n<4) {
                System.out.println(-1);
            }
            else {
                long ans = 0, ans1 = 0;
                ans = n / 4;
                ans1 = n / 6;
                if (n % 6 != 0)
                    ans1 = ans1 + 1L;
                System.out.println(Math.min(ans, ans1) + " " + Math.max(ans, ans1));
            }
        }
        sc.close();
    }
}
