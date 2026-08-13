import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 22;
        marks[1] = 44;
        marks[2] = 66;
    Scanner scr = new Scanner(System.in);
    System.out.println("Enter the array index");
    int a = scr.nextInt();
   
   System.out.println("Enter the value you want to be Divide");
   int b = scr.nextInt();
   
   try{
       System.out.println("The value entered in Array Index is: " + marks[a]);
       System.out.println("The result of division of array-value/b: " +  marks[a]/b);
   }
   catch(ArithmeticException e){
       System.out.println("ArithmeticException is occured");
       System.out.println(e);
   }
   catch(ArrayIndexOutOfBoundsException e){
       System.out.println("ArrayIndexOutOfBoundsException is occured");
       System.out.println(e);
   }
       catch(Exception e){
       System.out.println("Some other Exception is occured");
       System.out.println(e);
   }
     }
   
    }
