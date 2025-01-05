
import java.util.Scanner;

public class countDown {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n= sc.nextInt();
            String str=sc.next();
            int jump=1,maxJump=0;
            for(int i=0;i<n;i++) {
                if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' ||
                        str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'Y') {
                    maxJump=Math.max(jump,maxJump);
                    jump=1;
                    continue;
                }
                jump++;
            }
            System.out.println(maxJump);
        }
        sc.close();
    }
}
