package Week3.DAY15;

public class removeColoredPieces {
    public static boolean winnerOfGame(String colors) {
        int alice=0,bob=0;
        for(int i=1;i<colors.length()-1;i++) {
            if(colors.charAt(i-1)==colors.charAt(i) && colors.charAt(i)==colors.charAt(i+1)) {
                if(colors.charAt(i)=='A')
                    alice++;
                else
                    bob++;
            }
        }
        return alice>bob;
    }

    public static void main(String[] args) {
        String colors = "AAABABB";
        System.out.print(winnerOfGame(colors));
    }
}
