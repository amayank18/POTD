import java.util.*;
public class NewYearHurry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int i=1,t=0;
        int count=0;
        while(i<=n) {
            t += 5 * i;
            if((t+k)<=240)
                i++;
            else
                break;
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}