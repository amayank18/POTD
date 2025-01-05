
import java.util.Scanner;

public class santaAndLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            int count=0,i=0;
            while(k >= 0 && n > 0) {
                if(s.charAt(i)!='G')
                    k--;
                else {
                    count++;
                }
                i++;
                n--;
            }
            System.out.println(count);
        }
        sc.close();
    }
}
