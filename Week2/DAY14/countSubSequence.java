
import java.util.Scanner;

public class countSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            int zc=0,c=0;
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();

                if(a[i]==1)
                    c++;
                if(a[i]==0)
                    zc++;
            }
            System.out.println((long)Math.pow(2,zc)*c);
        }
    }
}
