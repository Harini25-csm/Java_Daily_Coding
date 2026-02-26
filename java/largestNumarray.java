import java.util.Scanner;
class Main{
    public static void main(String[] args){
        // initilizing max to the smallest possible integer value
        int max=Integer.MIN_VALUE;
        //Scanner onject to read user input 
        Scanner sc=new Scanner(System.in);
        //reading the  size of Array
        int n=sc.nextInt();
        //create an array of size n 
        int[] arr=new int[n];
        //loop to read array elements and find the max
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}