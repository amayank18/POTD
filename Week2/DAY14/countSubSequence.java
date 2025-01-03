package Week2.DAY14;

import java.util.Scanner;

public class countSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            int count=0;
            for(int i=0;i<n;i++) {
                a[i] = sc.nextInt();

                if(a[i]==1)
                    count++;
                if(a[i]==0)
                    count++;
            }
            System.out.println(count);
        }
    }
}
