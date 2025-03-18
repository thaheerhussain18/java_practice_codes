class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String s="";
        for(int j=0;(j<word1.length() && j<word2.length());j++){
            s+=word1.charAt(j)+""+word2.charAt(i);
            i+=1;
        }
        while(i<word1.length()){
            s+=word1.charAt(i);
            i+=1;
        }
        while(i<word2.length()){
            s+=word2.charAt(i);
            i+=1;
        }
        return s;

    }
}
