import java.util.HashMap;
public class freq_vowel_con{
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();//It store the key, freq of char,initially map={}
        for(char ch:s.toCharArray()){//creates array with char of s
            map.put(ch,map.getOrDefault(ch,0)+1);//map.getOrDefault(ch,0) 
            // => checks ch is their in map, if yes =>ch value else 0
        }
        int v=0,c=0;
        for(char ch:map.keySet()){
            if("aeiou".indexOf(ch)!=-1) v=Math.max(v,map.get(ch));
            else c=Math.max(c,map.get(ch)); 
        }
        return v+c;
    }
}