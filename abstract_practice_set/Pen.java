abstract class Pen{
     abstract void write();
     abstract void refill();
}
public class Main{
    public static void main(String[] args){
       // Pen p = new Pen(); --> cannot create object of abstract class.
        System.out.println("Pen is an abstract Class");
    }
}
