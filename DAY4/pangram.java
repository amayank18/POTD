import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        String str=sc.next();
        str=str.toLowerCase();
        char temp[]=str.toCharArray();
        for(char i=97;i<123;i++) {
            for(int j=0;j<n;j++) {
                if(temp[j]==i) {
                    count++;
                }
            }
        }
        if(count==26)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}