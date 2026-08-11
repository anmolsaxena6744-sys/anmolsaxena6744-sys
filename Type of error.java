import java.util.Scanner; 
public class Main{
    public static void main(String[] args){
        // Syntax Error DEMO
       
        int a = 3 ---> Error: no Semicolon 
        b = 5; ----> Error: b not declared 
        
        // Logical error DEMO
// Write a program to print all prime numbers from 1 to 10;
        System.out.println(2);
        
        for(int i = 1 ; i<=5 ; i++){
            System.out.println(2*i+1);
        }
        
        
        // Runtime error
        
        int k = 0;
        Scanner scr = new Scanner(System.in);
        k = scr.nextInt();
        System.out.println(1000/k); //---> through error when value of k is 0
    }
}
