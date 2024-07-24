import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.Math;
//a java program to create a simple calculator
public class calculator{
   //main function
   public static void main(String args[]){
   //store two numbers
   double n1,n2;
   //take input from the scanner
   Scanner sc= new Scanner(System.in);
   System.out.println("enter the numbers:");
   //take input
   n1=sc.nextDouble();
   n2=sc.nextDouble();
   System.out.println("enter the operator(+,*,-,/):");
   char op=sc.next().charAt(0);
   double o=0;
   switch(op){
        case '+' : o = n1 + n2;
                   break;
        case '-' : o = n1 + n2;
                   break;
        case '*' : o = n1 + n2;
                   break;
        case '/' : o = n1 + n2;
                   break;       
        default : System.out.println("INVALID CHOICE");
        }
        System.out.println("The final result:");
        System.out.println();
        
        //print thee final result  
        System.out.println(n1 +" "+ op +" "+ n2 +"="+o);
        }
        }
                                
