// //1. Problem Statement: (Easy)
// //Write a code to get the input in the given format and print the output in the given format
// // Sample Input:
// // 2
// // Sample Output:
// // 2

// import java.util.Scanner;
// public class Main{
//     public static void main(String[]args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         System.out.print(num);
//     }
// }
/*****************************************************************/

// //2. Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format
// // Sample Input:
// // 2 3 4 5 6 7 8
// // Sample Output:
// // 2 3 4 5 6 7 8

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String num=sc.nextLine();
//         System.out.print(num);
//     }
// }
/*****************************************************************/

// //3. Problem Statement:
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format.
// // Sample Input:
// // 5 3
// // 1 2 3 4 5
// // Sample Output:
// // 5 3
// // 1 2 3 4 5

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String num = sc.nextLine();
//         String nums = sc.nextLine();
//         System.out.println(num);
//         System.out.println(nums);
//     }
// }
/*****************************************************************/

// //4. Problem Statement: (Medium)
// // Write a code to get the input in the given format and print the output in the given format
// // Sample Input:
// // 2 4
// // 2 4
// // 2 4
// // Sample Output:
// // 2 4
// // 2 4
// // 2 4

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         while(sc.hasNextLine()){
//             String num = sc.nextLine();
//             System.out.println(num);
//         }
//     }
// }
/*****************************************************************/

// //5. Problem Statement:
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format
// // Sample Input:
// // 2 5
// // 2 5 6
// // 2 4 5
// // Sample Output:
// // 2 5
// // 2 5 6
// // 2 4 5

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         while(sc.hasNextLine()){
//             String num = sc.nextLine();
//             System.out.println(num);
//         }
//     }
// }
//*****************************************************************/

// //6. Problem Statement:
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format
// // Sample Input:
// // 2
// // 4
// // 5
// // Sample Output:
// // 2 4 5

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in); 
//         boolean first=true;
//         while(sc.hasNext()){
//             if (!first) System.out.print(" ");
//             System.out.print(sc.next());
//             first=false;
//         }
//     }
// }
/*****************************************************************/

// //7. Problem Statement: (Hard)
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format
// // Sample Input:
// // guvi
// // Sample Output:
// // g u v i

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in); 
//         String s=sc.nextLine();
//         for(int i=0;i<s.length();i++){
//             if (i>0) System.out.print(" ");
//             System.out.print(s.charAt(i));
//         }
//     }
// }
/*****************************************************************/

// //8. Problem Statement:
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format.
// // Sample Input:
// // 2.3 4.5 7.8
// // Sample Output:
// // 2.3
// // 4.5
// // 7.8

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         boolean first=true;
//         while (sc.hasNext()){
//             if (!first) System.out.print("");
//             System.out.println(sc.next());
//             first=false;
//         }
//     }
// }
/*****************************************************************/

// //9. Problem Statement:
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format.
// // Sample Input:
// // guvigeek
// // Sample Output:
// // g
// // u
// // v
// // i
// // g
// // e
// // e
// // k

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s=sc.nextLine();
//         for(int i=0;i<s.length();i++){
//             if (i>0) System.out.print("");
//             System.out.println(s.charAt(i));
//         }
//     }
// }
/*****************************************************************/

// //10. Problem Statement:
// // Problem Statement:
// // Write a code to get the input in the given format and print the output in the given format.
// // Sample Input:
// // guvi
// // Sample Output:
// // g,u,v,i

// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s=sc.nextLine();
//         for(int i=0;i<s.length();i++){
//             if (i>0) System.out.print(",");
//             System.out.print(s.charAt(i));
//         }
//     }
// }
/*****************************************************************/
