class minimumMovesToConvertString {
    public int minimumMoves(String s) {
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++) {
            if(s.charAt(i)!='O') {
                count++;
                i+=2;
            }
        }
        return count;
    }
}