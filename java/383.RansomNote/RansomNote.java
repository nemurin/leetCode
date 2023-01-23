class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            if(!map.containsKey(magazine.substring(i,i+1))){map.put(magazine.substring(i,i+1),1);}
            else{Integer temp = map.get(magazine.substring(i,i+1))+1;
                map.put(magazine.substring(i,i+1),temp);}
        }
        for(int i=0;i<ransomNote.length();i++){
            if(!map.containsKey(ransomNote.substring(i,i+1))||map.get(ransomNote.substring(i,i+1))<=0){return false;}
            Integer temp = map.get(ransomNote.substring(i,i+1))-1;
            map.put(ransomNote.substring(i,i+1),temp);
        }
        return true;
    }
}