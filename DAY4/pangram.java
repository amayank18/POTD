import java.util.*;
public class pangram {
    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        String str=sc.nextLine();
        str=str.toLowerCase();
        char temp[]=str.toCharArray();
        for(int i=0;i<n;i++) {
            for(int j=97;j<123;j++) {
                if(temp[i]==j) {
                    count++;
                }
            }
        }
        if(count==n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}