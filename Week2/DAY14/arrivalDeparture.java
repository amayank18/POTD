package Week2.DAY14;

import java.util.Arrays;

public class arrivalDeparture {

    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int count = 1, ans = 1, n = arr.length;
        int i = 1, j = 0;
        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                count++;
                i++;
            }
            else if (arr[i] > dep[j]) {
                count--;
                j++;
            }
            if (count > ans)
                ans = count;
        }
        return ans;
    }

    public static void main(String[] args)
    {

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(findPlatform(arr, dep));
    }
}
