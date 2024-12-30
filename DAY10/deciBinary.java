package DAY10;

public class deciBinary {
    public static int minPartitions(String s) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - '0';
            if (temp > ans) {
                ans = temp;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //String str="32";
        //String str="82734";
        String str="27346209830709182346";
        System.out.println(minPartitions(str));
    }
}
