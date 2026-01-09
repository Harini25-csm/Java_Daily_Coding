//1. (Easy)
/*
* Problem Statement:  
You are given Two Numbers, A and B. If C = A + B. Find C. Note: Round off the output to a single decimal place.
Sample Input:
1
1
Sample Output:
2
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c=a+b;
        
//         System.out.println(c);
//     }
// }
/***********************************************************/

// //2. 
/*
* Problem Statement: 
You are given A = Length of a rectangle & B = breadth of a rectangle. Find its area “C”. (A and B are natural numbers)
Explanation:
Area = LB = AB = 2*3 = 6
Sample Input:
2
3
Sample Output:
6
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int a = obj.nextInt();
//         int b = obj.nextInt();
//         int Area=a*b;
//         System.out.println(Area);
//     }
// }
/***********************************************************/

// //3. 
/*
* Problem Statement: 
You are given a number A in Kilometers. Convert this into B: Meters and C: Centi-Metres.
Explanation:
1 KM = 1000 M
1M = 100 CM
1KM = 1000*100 CM = 100000 CM
Sample Input:
2
Sample Output:
2000200000
*/


// // import java.util.Scanner;
// // public class Beginner_code {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         long km=sc.nextLong();
// //         long m=km*1000;
// //         long cm=m*100;
// //         System.out.println(m);
// //         System.out.println(cm);
// //     }
// // }
/***********************************************************/

// //4. 
/*
*Problem Statement: 
The area of an equilateral triangle is ¼(√3a²) where "a" represents a side of the triangle. 
You are provided with the side "a". Find the area of the equilateral triangle.
Explanation:
Area of Triangle = ½ × base × height
⇒ Area = ½ × a × ½(√3a)
when a = 20
Area = 173.21
Sample Input:
20
Sample Output:
173.21
*/


// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         double a = obj.nextDouble();
//         double area=(Math.sqrt(3)/4)*a*a;
//         System.out.printf("%.2f",area);
//     }
// }
/***********************************************************/

// //5.
/*
*Problem Statement: 
You are given three numbers A, B & C. Print the largest amongst these three numbers.
Sample Input:
1
2
3
Sample Output:
3
Explanation:
3 > 2 && 1
*/
 

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);

//         double a = obj.nextDouble();
//         double b = obj.nextDouble();
//         double c = obj.nextDouble();

//         double max = a;

//         if (b > max) max = b;
//         if (c > max) max = c;

//         // Print without decimal if not needed
//         if (max == (int)max)
//             System.out.println((int)max);
//         else
//             System.out.println(max);
//     }
// }
/***********************************************************/

// //6. 
/*
* Problem Statement: 
Let "A" be a year, write a program to check whether this year is a leap year or not. 
Print "Y" if its a leap year and "N" if its a common year.
Sample Input:
2020
Sample Output:
Y
Explanation:
2020 is a leap year.
 */

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int year = obj.nextInt();
//         if ((year%400==0) || (year%4==0 && year%100!=0)){
//             System.out.println("Y");
//         }
//         else{
//             System.out.println("N");
//         }
//     }
// }
/***********************************************************/

// //7.
/*
*Problem Statement:
You are given the coefficients of a quadratic equation in order A, B & C.
Where A is the coefficient of X², B is the coefficient of X and C 
is the constant term in the most simplified form.

Example: For X² + 5X + 6 = 0, you are given the input as: 1 5 6.
Write a program to find all of the roots of the quadratic.
Note: The output should be up to 2nd decimal place (round off if needed) and 
in case of a recurring decimal use braces i.e. for eg: 0.33333..... => 0.33.
Note: Use Shri Dharacharya's Method to solve i.e. X = {-b + √(b² - 4ac) } / 2a & {-b-√(b² -4ac)} / 2a

Explanation:
X = {-b + √(b² - 4ac) } / 2a & {-b-√(b² -4ac)} / 2a
a = 1, b = 5, c = 6.
Sample Input:
1 5 6
Sample Output:
-2.00
-3.00
*/

/***********************************************************/

// //8.
/*
* Problem Statement:
You are provided with a number check whether its odd or even.
Print "Odd" or "Even" for the corresponding cases.
Note: In case of a decimal, Round off to nearest integer and then find the output. 
Incase the input is zero, print "Zero".
Explanation:
2%2 = 0.
2 is an even number.
Sample Input:
2
Sample Output:
Even
*/

// import java.util.Scanner;

// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);

//         double x = obj.nextDouble();   // read ANY numeric input
//         long n = Math.round(x);        // convert safely to integer

//         if (n == 0) {
//             System.out.println("Zero");
//         } 
//         else if (n % 2 == 0) {
//             System.out.println("Even");
//         } 
//         else {
//             System.out.println("Odd");
//         }
//     }
// }
/*****************************************************************/

// //9. 
/*
* Problem Statement:  
You are given with a number "N", find its cube.
Sample Input:
2
Sample Output:
8
Explanation:
2 Cube is 222 = 8
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         long n = obj.nextLong();
//         long cube_n=n*n*n;
//         System.out.println(cube_n);
//     }
// }
/*****************************************************************/

// //10.
/*
* Problem Statement:
Let "A" be a string. Remove all the whitespaces and find it's length.
Sample Input:
Lorem Ipsum
Sample Output:
10
Explanation:
Lorem Ipsum becomes LoremIpsum after removing the whitespaces and
 hence the length of this string is equal to 10.
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         String s = obj.nextLine();
//         int c=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)!=' '){
//             c+=1;
//             }
//         }
//         System.out.println(c);
//     }
// }
/*****************************************************************/

// //11. 
/*
* Problem Statement:
Problem Statement:
You are provided with a number, "N". Find its factorial.
Explanation:
2! = 2*1 = 2
Sample Input:
2
Sample Output:
2
 */

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int f=1;
//         for(int i=1;i<=n;i++){
//             f=f*i;
//         }
//         System.out.println(f);
//     }
// }
/*****************************************************************/

// //12.
/*
* Problem Statement:
Print the First 3 multiples of the given number "N". (N is a positive integer)
Note: print the characters with a single space between them.
Sample Input:
2
Sample Output:
2 4 6
Explanation:
The first 3 multiples of 2 are
21 = 2
22 = 4
2*3 = 6
printing them with single spaces gives:
2 4 6
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         for(int i=1;i<=3;i++){
//             System.out.print(n*i);
//             if (i<3) System.out.print(" ");
//         }
        
//     }
// }
/*****************************************************************/

// //13.
/*
* Problem Statement:
You are given with a number A i.e. the temperature in Celcius. 
Write a program to convert this into Fahrenheit.
 Note: In case of decimal values, round-off to two decimal places.
 Explanation:
(X°C × 9/5) + 32 = 32°Fhere X is the input
Sample Input:
12
Sample Output:
53.60
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         double c = obj.nextDouble();
//         double f=(c*9/5)+32;
//         System.out.printf("%.2f",f);
//     }
// }
/*****************************************************************/

// //14.
/*
* Problem Statement:
You are provided with the radius of a circle "A". Find the length of its circumference. 
Note: In case the output is coming in decimal, roundoff to 2nd decimal place. 
In case the input is a negative number, print "Error".
Explanation:
Circumference of a Circle = 2*(22/7)*r 
where 22/7 represents 'pie' and r represents the radius of the circle.
Sample Input:
2
Sample Output:
12.57
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         double r = obj.nextDouble();
//         if(r<0){
//         System.out.println("Error");
//         }else{
//             double c=2*Math.PI*r;
//             System.out.printf("%.2f",c);
//         }
//     }
// }
/*****************************************************************/

// // 15.
/*
* Problem Statement:
You will be provided with a number. Print the number of days in the month corresponding 
to that number. Note: In case the input is February, print 28 days. 
If the Input is not in valid range print "Error".
Explanation:
8 corresponds to august month.
There are 31 days in the month of August.
Sample Input:
8
Sample Output:
31
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int m = obj.nextInt();
//         if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
//             System.out.println(31);
//         }
//         else if (m==4 || m==6 || m==9 || m==11){
//             System.out.println(30);
//         }
//         else if (m==2){
//             System.out.println(28);
//         }
//         else{
//             System.out.println("Error");
//         }
//     }
// }
/*****************************************************************/

// //16.
/*
* Problem Statement:
You are provided with a number "N", Find the Nth term of the
 series: 1, 4, 9, 16, 25, 36, 49, 64, 81, .......
(Print "Error" if N = negative value and 0 if N = 0).
Explanation:
The Nth term is the series = NN
1818 = 324
Sample Input:
18
Sample Output:
324
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         if(n<0){
//         System.out.println("Error");
//         }else{
//             System.out.println(n*n);
//         }
//     }
// }
/*****************************************************************/

// //17.
/* Problem Statement:
You are provided with two numbers. Find and print the smaller number.
Sample Input:
23 1
Sample Output:
1
Explanation:
1 < 23
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int a = obj.nextInt();
//         int b = obj.nextInt();
//         if(a>b){
//         System.out.println(b);
//         }else{
//             System.out.println(a);
//         }
//     }
// }
/*****************************************************************/

// //18.
/*
* Problem Statement:
You are given with Principle amount($), Interest Rate(%) and 
Time (years) in that order. Find Simple Interest.
Print the output up to two decimal places (Round-off if necessary). (S.I. = PTR/100)
Explanation:
P = 1000 $
T = 2 Years
R = 5 %
S.I. = 100025/100 = 100.00
Sample Input:
1000 2 5
Sample Output:
100.00
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         long p = obj.nextLong();
//         float t=obj.nextFloat();
//         double r=obj.nextDouble();
//         double si=(p*t*r)/100;
//         System.out.printf("%.2f",si);
//     }
// }
/*****************************************************************/

// //19.
/* Problem Statement:
Using the method of looping, write a program to 
print the table of 9 till N in the format as follows:
(N is input by the user)
9 18 27...
Print NULL if 0 is input.
Sample Input:
3
Sample Output:
9 18 27
Explanation:
91 = 9
92 = 18
9*3 = 27
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         if(n==0){
//             System.out.println("NULL");
//         }else{
//             for(int i=1;i<=n;i++){
//                 System.out.print(9*i);
//                 if(i<n) System.out.print(" ");
//             }
//         }
//     }
// }
/*****************************************************************/

// //20.
/*
* Problem Statement:
Write a code to get the input and print it 5 times.
Explanation:
The value N has been written 5 times.
Sample Input:
4
Sample Output:
4
4
4
4
4
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         for(int i=1;i<=5;i++){
//             System.out.println(n);
//         }
//     }
// }
/*****************************************************************/

// //21.
/*
* Problem Statement:
Write a code to get 2 integers A and N. Print the integer A, N times in separate line.
Explanation:
The integer A(2) is printed N(3) times.
Sample Input:
2 3
Sample Output:
2
2
2
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int a = obj.nextInt();
//         int n = obj.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.println(a);
//         }
//     }
// }
/*****************************************************************/

// //22.
/*
* Problem Statement:
Write a code to get an integer N and print values from 1 till N in a separate line.
Sample Input:
5
Sample Output:
1
2
3
4
5
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         for(int i=1;i<=n;i++){
//             System.out.println(i);
//         }
//     }
// }
/*****************************************************************/

// //23.
/*
* Problem Statement:
Write a code to get an integer N and 
print the even values from 1 till N in a separate line.
Explanation:
The even values from 1 upto N is printed.
Sample Input:
6
Sample Output:
2
4
6
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }
/*****************************************************************/

// //24.
/*
* Problem Statement:
Write a code to get an integer N and print the values from N to 1.
Explanation:
The values from N upto 1 is printed.
Sample Input:
10
Sample Output:
10
9
8
7
6
5
4
3
2
1
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         for(int i=n;i>=1;i--){
//             System.out.println(i);
//         }
//     }
// }
/*****************************************************************/

// //25.
/* Problem Statement:
Write a code to get an integer N and print the sum of values from 1 to N.
Explanation:
The sum of values from 1-10 is 55.
Sample Input:
10
Sample Output:
55
*/

// import java.util.Scanner;
// public class Beginner_code {
//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         int n = obj.nextInt();
//         int total=0;
//         for(int i=1;i<=n;i++){
//            total=total+i; 
//         }
//         System.out.println(total);
//     }
// }
/*****************************************************************/



