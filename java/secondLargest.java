class secondLargest {
    public int secondHighest(String s) {
        int first=-1;
        int second=-1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int num=ch-'0';
                if(num>first){
                    second=first;
                    first=num;
                }
                else if(num<first && num>second){
                    second=num;
                }
            }
        }
        return second;
    }
    public static void main(String[] args){
        String s="dfa12321afd";
        secondLargest sh=new secondLargest();
        System.out.println(sh.secondHighest(s));
    }
}
/*
ex: 1, 3, 2, 4
f=-1
s=-1
num=starting num ==>1
if num>f(1>-1)
s=-1(f)
f=1(num)
if(3>1)
s=1
f=3
if(2>3) wrong
else if(num<f(2<3) && num>s(2>1))
s=2
return 2;
*/