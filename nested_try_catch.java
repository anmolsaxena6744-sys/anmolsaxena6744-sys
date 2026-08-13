import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int[] marks = new int[3];
        marks[0] = 44;
        marks[1] = 66;
        marks[2] = 88;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int a = scr.nextInt();
        try{
            System.out.println("Welcome to vedio no 82");
            try{
                 System.out.println(marks[a]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry this index is not found");
                 System.out.println("Exception in level 2");
            }
        }
        catch(Exception e) {
              System.out.println("Exception in level 1");
       
        }
    }
}
// OUTPUT
// Enter the value of index
// 3
// Welcome to vedio no 82
// Sorry this index is not found
// Exception in level 2
