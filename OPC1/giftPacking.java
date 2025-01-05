
import java.util.Scanner;

public class giftPacking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int l=sc.nextInt();
            int b=sc.nextInt();
            int h=sc.nextInt();
            int s=sc.nextInt();
            if(l*b*h < s*s*s) {
                System.out.println("CUBOID");
            }
            else if(l*b*h > s*s*s) {
                System.out.println("CUBE");
            }
            else
                System.out.println("EQUAL");
        }
        sc.close();
    }
}
