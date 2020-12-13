class Solution {
    public boolean canTransform(String start, String end) {
        var len=start.length();
        int i=scan(start, 0);
        int j=scan(end, 0);
        while (i<len&&j<len) {
            char s=start.charAt(i);
            char e=end.charAt(j);
            if (s!=e) {
                return false;
            }
            if (s=='R'&&j<i) {
                return false;
            }
            if (s=='L'&&j>i) {
                return false;
            }
            i = scan(start,i+1);
            j = scan(end,j+1);
        }
        return i==j;
    }
    
    int scan(String str,int idx) {
        while (idx<str.length()) {
            if (str.charAt(idx)!='X') {
                return idx;
            }
            idx++;
        }
        return idx;
    }
}
