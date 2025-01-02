
import java.util.Scanner;

public class longestDivisorsInterval {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long n=sc.nextLong();
            int count=1;
            for(int i=2; n%i==0 && i<=n; i++) {
                ++count;
            }
            System.out.println(count);
        }
    }
}
