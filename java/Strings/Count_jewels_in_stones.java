// Jewels and Stones

package Strings;

public class Count_jewels_in_stones {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        // for(int i=0;i<=jewels.length()-1;i++){
        //     for(int j=0;j<=stones.length()-1;j++){
        //         if(jewels.charAt(i)==stones.charAt(j)){
        //             c+=1;
        //         }
        //     }
        // }
        for(int i=0;i<=stones.length()-1;i++){
            char ch=stones.charAt(i);
            if(jewels.indexOf(ch)!=-1){
                c+=1;
            }
        }
        return c;
    }
}

/*
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
*/