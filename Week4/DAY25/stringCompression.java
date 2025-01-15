package Week4.DAY25;

public class stringCompression {
//    public static int compress(char[] chars) {
//        StringBuilder sb= new StringBuilder();
//        for (int i = 0; i < chars.length; i++) {
//            Integer count=1;
//            while(i<chars.length-1 && chars[i]==chars[i+1]) {
//                count++;
//                i++;
//            }
//            sb.append(chars[i]);
//            if(count>1) {
//                sb.append(count);
//            }
//        }
//        System.out.println(sb);
//        return sb.length();
//    }

    public static int compress(char[] chars) {
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            Integer count=1;
            while(i<chars.length-1 && chars[i]==chars[i+1]) {
                count++;
                i++;
            }
            sb.append(chars[i]);
            if(count>1) {
                sb.append(count);
            }
        }
        sb.getChars(0,sb.length(),chars,0);
        return sb.length();
    }

    public static void main(String[] args) {
//        char[] chars= {'a','a','b','b','c','c','c'};
//        char[] chars= {'a'};
        char[] chars= {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compress(chars));
    }
}
