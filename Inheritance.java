// Inheritance code
class Base{
  public int x;
  public int getx(){
    return x;
  }
  public void setx(int x){
    System.out.println("I am in base and setting x now");
    this.x = x;
  }
  
}

class Derived extends Base {
  public int y;

  public int gety(){
  return y;
  }

  public void sety(int y){
    this.y = y;
  }
}
public class Main{
  public static void main(String[] args){

    Base b = new Base();
    b.setx(21);
    System.out.println(b.getx());

    Derived a = new Derived();
    a.sety(43);
    System.out.println(a.gety());
  }
}
    
  
