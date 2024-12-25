class cookiesAssign {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int left=0,right=0;
        while(left<g.length&&right<s.length) {
            if(g[left]<=s[right]) {
                left++;
                right++;
            }
            else if(g[left]>s[right])
                right++;
            else
                left++;
        }
        return left;
    }
}