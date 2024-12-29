
import java.util.Scanner;

public class LongLong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            long count=0,sum=0,neg=0;
            for(int i=0;i<n;i++) {
                sum+=Math.abs(arr[i]);
                if(arr[i]<0) {
                    if(neg==0) {
                        neg = 1;
                        count++;
                    }
                }
                else if(arr[i]>0) {
                    neg=0;
                }
            }
            System.out.println(sum + " " + count);
        }
    }
}
