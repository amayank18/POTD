package Week1.DAY1;

import java.util.*;
public class stringScore {
    public static int scoreOfString(String s) {
        int score=0;
        for(int i=0;i<s.length()-1;i++) 
            if(i!=s.length())
                score+=Math.abs(s.charAt(i)-s.charAt(i+1));
        return score;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int score=scoreOfString(s);
        System.out.println(score);
    }
}