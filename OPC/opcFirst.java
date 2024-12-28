
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class opcFirst {
    public static void swap(int[] arr) {
        boolean flag=false;
        int i=0,j=arr.length-1;
        while(i<j) {
            if (arr[i] > arr[j] && (arr[i]%arr[j])==1) {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;

            }
            j--;
        }
        int t=1;
        for(int k=1;k<arr.length;k++) {
            if(arr[k-1]<arr[k])
                t++;
        }
        if(t==arr.length-1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            swap(arr);

        }
    }
}
