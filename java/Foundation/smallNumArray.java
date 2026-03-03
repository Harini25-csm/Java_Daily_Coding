package Foundation;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<max){
                max=arr[i];
        
            }
            
        }
        System.out.println(max+" ");
    }
}
/*
sum(10,20,30,40) => 100
sum(3,4,2) =>10
sum(2) =>2
sum() =>0
*/