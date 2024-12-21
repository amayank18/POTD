package DAY1;
import java.util.*;
public class gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
    }
    public static int gcd(int a, int b) {
        int result;
        while(a>0 && b >0) {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        // if(a==0)
        //     return b;
        // else
        //     return a;
        return Math.max(a,b);
    }
}
