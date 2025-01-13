package Week3.DAY18;

public class nthRootOfm {

    public static int search(int n, int m) {
        int start = 1, end = m;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Math.pow(mid, n) == m) {
                return mid;
            } else if (Math.pow(mid, n) <= m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int nthRoot(int n, int m) {
        // code here
        return search(n,m);
    }


    public static void main(String[] args) {
        int n=2,m=9;
        System.out.println(nthRoot(n,m));
    }
}
