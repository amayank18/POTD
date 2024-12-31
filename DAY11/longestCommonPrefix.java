package DAY11;

public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        int len=0;
        while(true) {
            if(len < strs[0].length()){
                boolean allWell = true;
                char ch=strs[0].charAt(len);

                for(int i=1;i<strs.length;i++) {
                    if(len>=strs[i].length() || strs[i].charAt(len)!=ch) {
                        allWell=false;
                        break;
                    }
                }
                if(allWell)
                    len++;
                else
                    break;
            }
            else
                break;
        }
        return strs[0].substring(0,len);
    }
}
