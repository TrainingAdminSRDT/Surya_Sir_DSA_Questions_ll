class Solution {
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(mp.containsKey(ch)){
                int curr=mp.get(ch);//this is to get the value of the key
                curr++;
                mp.put(ch,curr);
            }else{
                mp.put(ch,1);
            }
        }
        return mp;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> mp1=makeFreqMap(s);
        HashMap<Character,Integer> mp2=makeFreqMap(t);
        return mp1.equals(mp2);
    }
}