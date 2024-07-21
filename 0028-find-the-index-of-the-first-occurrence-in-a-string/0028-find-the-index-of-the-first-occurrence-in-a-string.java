class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        int c = -1,j=0;
        for(int i = 0;i<h;i++)
        {
            if(i+n <= h){
                if((haystack.substring(i,i+n)).equals(needle))
                {
                    c = i;
                    break;
                }
            }
            else
               c = -1;
        }
        return c;
    }
}