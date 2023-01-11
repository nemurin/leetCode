class Solution {
    public int romanToInt(String s) {
        int ans =0;
        int splitedNum = 0;
        int rightNum=0;
        for(int i=s.length()-1;i>=0;i--){
            rightNum = splitedNum;
            if(s.charAt(i)=='I'){splitedNum=1;}
            else if (s.charAt(i)=='V'){splitedNum=5;}
            else if (s.charAt(i)=='X'){splitedNum=10;}
            else if (s.charAt(i)=='L'){splitedNum=50;}
            else if (s.charAt(i)=='C'){splitedNum=100;}
            else if (s.charAt(i)=='D'){splitedNum=500;}
            else if (s.charAt(i)=='M'){splitedNum=1000;}
            if(i<s.length()-1&&splitedNum<rightNum){ans-=splitedNum;}
            else{ans+=splitedNum;}
        }
        return ans;
    }
}