
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