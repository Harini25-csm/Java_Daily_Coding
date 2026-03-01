public class reverseString {
    public static void reversingStr(char[] s){
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;

            left++;
            right--;
        }
    }
}
/*
s = ["h","e","l","l","o"]
      0   1   2   3   4
if(left<right) => 0<4
[o,e,l,l,h]
left++ => 1
right-- => 3
[o,l,l,e,h]
left++=right--=idx(2)
[o,l,l,e,h]
*/
