// // 1. (Easy)
// /* Problem Statement:
// Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.
// Sample Input:
// 9 2
// Sample Output:
// odd
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int m=obj.nextInt();
//         int sum=n+m;
//         if(sum%2==0){  
//             System.out.println("even");
//         }else{
//             System.out.println("odd");
//         }
//     }
// }
/*****************************************************************/

// // 2. 
// /* Problem Statement:
// Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.
// Sample Input:
// 123
// Sample Output:
// no
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         boolean isPrime=true;
//         if(n<2){
//             isPrime=false;
            
//         }
//         for(int i=2;i<n;i++){
//             if(n%i==0){
//                 isPrime=false;
//                 break;
//             }
//         }
//         if(isPrime){
//                 System.out.println("yes");
//             }else{
//                 System.out.println("no");
//             }
        
//     }
// }
/*****************************************************************/

// // 3.
// /* Problem Statement:
// Given a number N, print yes if the number is a multiple of 7 else print no.
// Sample Input:
// 49
// Sample Output:
// yes
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         if(n%7==0){
//             System.out.println("yes");
//         }else{
//             System.out.println("no");
//         }
//     }
// }
/*****************************************************************/

// // 4.
// /* Problem Statement:
// Given a number N, find its next immediate greater power of 2(i.e 2^1, 2^2, 2^3...).
// Sample Input:
// 4
// Sample Output:
// 8
// */

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int p = 1;
//         while(p <= n){
//             p *= 2;
//         }
//         System.out.println(p);
//     }
// }
/*****************************************************************/

// // 5.
// /* Problem Statement:
// Given a string S, print 'yes' if it is a palindrome or 'no' if it is not a palindrome.
// Sample Input:
// lappal
// Sample Output:
// yes
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         String s = obj.nextLine();
//         String rev="";
//         for(int i=s.length()-1;i>=0;i--){
//             rev+=s.charAt(i);
//         }
//         if(s.equals(rev)){
//             System.out.println("yes");
//         }else{
//             System.out.println("no");
//         }
//     }
// }
/*****************************************************************/

// // 6.
// /* Problem Statement:
// Given a string S, print 'yes' if it has a vowel in it else print 'no'.
// Sample Input:
// codekata
// Sample Output:
// yes
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         boolean hasVowel=false;
//         String s = obj.nextLine();
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//             if("AEIOUaeiou".indexOf(ch)!=-1){
//                 hasVowel=true;
//                 break;
//             }
//         }
//         if(hasVowel){
//             System.out.println("yes");
//         }else{
//             System.out.println("no");
//         }
//     }
// }
/*****************************************************************/

// // 7.
// /* Problem Statement:
// Given 3 numbers N , L and R. Print 'yes' if N is between L and R else print 'no'.
// Sample Input:
// 3
// 2 6
// Sample Output:
// yes
// */

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String[] args) {

//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int l = obj.nextInt();
//         int r = obj.nextInt();

//         int low = Math.min(l, r);
//         int high = Math.max(l, r);

//         if(n > low && n < high)
//             System.out.println("yes");
//         else
//             System.out.println("no");
//     }
// }
/*****************************************************************/

// // 9.
// /* Problem Statement:
// Given a string S, print it after changing the middle element to * 
// (if the length of the string is even, change the 2 middle elements to *).
// Sample Input:
// hello
// Sample Output:
// he*lo
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         String s = obj.nextLine();
//         char[] arr=s.toCharArray();
//         int n=s.length();
//         if(n%2==1){
//             int mid=n/2;
//             arr[mid]='*';
//         }else{
//             int mid1=n/2-1;
//             int mid2=n/2;
//             arr[mid1]='*';
//             arr[mid2]='*';
//         }
//         System.out.println(new String(arr));
//     }
// }
/*****************************************************************/

// // 14.
// /* Problem Statement:
// Given a number N, print the odd digits in the number(space seperated)
//  or print -1 if there is no odd digit in the given number.
//  Sample Input:
// 2143
// Sample Output:
// 1 3
// */

// import java.util.Scanner;

// public class Arrays {
//     public static void main(String[] args) {

//         Scanner obj = new Scanner(System.in);
//         String s = obj.nextLine();

//         int n = s.length();
//         int[] arr = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = s.charAt(i) - '0';
//         }

//         String result = "";
//         boolean found = false;

//         for(int i = 0; i < n; i++){
//             if(arr[i] % 2 == 1){
//                 result += arr[i] + " ";
//                 found = true;
//             }
//         }
//         if(found)
//             System.out.print(result.trim());
//         else
//             System.out.print(-1);
//     }
// }
/*****************************************************************/

// // 17.
// /*
// Given a string S, print 2 strings such that first string containing all 
// characters in odd position(s) and other containing all characters in even position(s).
// Sample Input:
// XCODE
// Sample Output:
// XOE CD
// */

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         String s = obj.nextLine();
//         char[] arr=s.toCharArray();
//         int n=s.length();
        
//         String even="";
//         String odd="";
//         for(int i=0;i<n;i++){
//             if(i%2==0){
//                 even+=arr[i];
//             }else{
//                 odd+=arr[i];
//             }
//         }
//         System.out.println(even+" "+odd);
//     }
// }
/*****************************************************************/

// // 26.
// /* Problem Statement:
// Given 2 numbers N and K followed by elements of N .Print 'yes' if K exists else print 'no'.
// Sample Input:
// 4 2
// 1 2 3 3
// Sample Output:
// yes
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int k = obj.nextInt();
//         int[] arr=new int[n];
        
//         for(int i=0;i<n;i++){
//             arr[i]=obj.nextInt();
//         }
//         boolean found=false;
//         for(int i=0;i<n;i++){
//             if(arr[i]==k){
//                 found=true;
//                 break;
//             }
//         }
//         if(found)
//             System.out.println("yes");
//         else
//             System.out.println("no");
//     }
// }
/*****************************************************************/

// //27. 
// /* Problem Statement:
// Given 2 numbers N and K followed by N elements,
// print the number of repetition of K otherwise print '-1' if the element not found.
// Sample Input:
// 6 2
// 1 2 3 5 7 8
// Sample Output:
// 1
// */

// import java.util.Scanner;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int k = obj.nextInt();
//         int[] arr=new int[n];
//         int c=0;
       
//         for(int i=0;i<n;i++){
//             arr[i]=obj.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]==k){
//                 c+=1;
//             }
//         }
//         if(c>0)
//             System.out.println(c);
//         else
//             System.out.println(-1);
//     }
// }
/*****************************************************************/

// //33.
// /* Problem Statement:
// Given a number N followed by N elements, 
// find the second smallest element.If it cannot be found then print -1
// Sample Input:
// 5
// 1 2 3 4 5
// Sample Output:
// 2
// */

// import java.util.*;
// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n<2){
//             System.out.println(-1); return;
//         }
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++) arr[i]=sc.nextInt();
//         Arrays.sort(arr);
//         for(int i=1;i<n;i++){
//             if(arr[i]!=arr[0]){
//                 System.out.println(arr[i]);
//                 return;
//             }
//         }
//         System.out.println(-1);
//     }
// }
/*****************************************************************/

// //34.
// /* Problem Statement:
// Given 2 numbers N and K followed by N elements, 
// find the Kth smallest element. If the element cannot be found then print -1
// Sample Input:
// 5 2
// 1 1 2 4 5
// Sample Output:
// 2
// */

// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

//         Arrays.sort(arr);

//         int count = 1; // first distinct element
//         for (int i = 1; i < n; i++) {
//             if (arr[i] != arr[i - 1]) {
//                 count++;
//                 if (count == k) {
//                     System.out.println(arr[i]);
//                     return;
//                 }
//             }
//         }
//         System.out.println(-1);
//     }
// }
/*****************************************************************/



