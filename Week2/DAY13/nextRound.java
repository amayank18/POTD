
import java.util.Scanner;

public class nextRound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            if (a[k-1] <= a[i] && a[i]>0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
