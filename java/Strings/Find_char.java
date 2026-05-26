// Find Words Containing Character

import java.util.*;
class Find_char{
    public List<Integer> FindWordsContaining(String[] words,char x){
        List<Integer> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(x)!=-1){
                result.add(i);
            }
        }
        return result;
    }
}

/*
Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1.


words = ["abc","bcd","aaaa","cbc"]
x = 'a'
List<Integer> result=new ArrayList<>();   => creates empty list result=[]
for(int i=0;i<words.length;i++)
words.length=4
words[i] => words[0] =>"abc"
"abc".indexOf('a') => 'a' is found at index of 0 => 0!=-1 (true)
result.add(i); =>result.add(0)
result=[0]
same steps for each index ==> finally result=[0,2]
*/