class Base1{
  Base1(){
  System.out.println("I am a constructor");
  }
  Base1(int x){
     System.out.println("I am a overloaded constructor with value of x as:" + x);
  }
}

class Derived1 extends Base1{
  Derived1(){
   // super(0);
    System.out.println("I am a Derived1 constructor");
  }
  Derived1(int x , int y){
    super(x);
      System.out.println("I am a overloaded constructor with value of y as:" + y);
  }
}
class ChildofDerived extends Derived1{
  ChildofDerived(){
    System.out.println("I am a ChildofDerived constructor");
  }
  ChildofDerived(int x , int y , int z){
    super(x , y);
    System.out.println("I am a overloaded constructor with value of z as:" + z);
  }
}
public class Main{
  public static void main(String[] args){
    //Base1 A = new Base1();
    //Derived1 B = new Derived1();
    //Derived1 B = new Derived1(2 , 3);
    //ChildofDerived scr = new ChildofDerived();
    ChildofDerived scr = new ChildofDerived(2 , 3 ,6);
  }
}
    
    
