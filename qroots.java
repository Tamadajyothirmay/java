 import java.util.Scanner;
public class qroots{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("the equation is of the form ax^2 + bx + c");
     System.out.println("enter the values a,b,c");
     double a = sc.nextDouble();
     double b = sc.nextDouble();
     double c = sc.nextDouble();
     double d = (b * b) - (4 * a * c);
     
     if(d>0){
            double root1 = (-b + Math.sqrt(d))/(2*a);
            double root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("the equation has two real roots:" + root1 + "and" + root2);
            }
     else if(d==0){
     double root=b/(2*a);
     System.out.println("the equation has only one root:"+ root);
     }
     else{
            double realpart = -b/(2*a);
            double imaginarypart = Math.sqrt(-d)/(2*a);
            System.out.println("the equation has two complex roots:" + realpart + "+" + imaginarypart + "i annd" + realpart + "-" + imaginarypart + "i" );
            }
            }
            }
            
