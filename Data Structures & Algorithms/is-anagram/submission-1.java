class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
         return false;

        HashMap<Character,Integer> count =  new HashMap<Character,Integer>();
        for(char ch : s.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            count.put(ch,count.getOrDefault(ch,0)-1);
        }
        for(int var : count.values()){
            if(var!=0)
            return false;
        }
    return true;

}
}