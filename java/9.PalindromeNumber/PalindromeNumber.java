class Solution {
    public boolean isPalindrome(int x) {
        String input = Integer.valueOf(x).toString();
        Boolean ans = true;
        for(int i=0;i<input.length()/2;i++){
            if(input.charAt​(i)!=input.charAt​(input.length()-1-i)){ans=false;break;}
        }
        return ans;
    }
}