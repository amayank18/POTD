package DAY9;

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
            int count=0,sum=0;

            System.out.println(sum + " " + count);
        }
    }
}
