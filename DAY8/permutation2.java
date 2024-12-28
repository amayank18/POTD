package DAY8;

import java.util.Scanner;

public class permutation2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }
            int ts = n * (n + 1) / 2;
            if (ts != sum)
                break;
            int i = 0, j = arr.length - 1, count = 0;
            while (i < j) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    count++;
                    i++;
                    //j--;
                }
                //i++;
                j--;
            }
            System.out.println(count);
        }
    }
}
