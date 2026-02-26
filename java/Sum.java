import java.util.Scanner;
public class Sum{
    public static int sum(int... args) {
        int total=0;
        for(int i=0;i<args.length;i++){
            total+=args[i];
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr));
        sc.close();
    }
}
