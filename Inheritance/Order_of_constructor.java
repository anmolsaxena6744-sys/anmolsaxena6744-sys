class Base{
    Base(){
        System.out.println("Base Constructor......");
    }
}
class Derived1 extends Base{
    Derived1(){
        System.out.println("Derived1 Constructor......");
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2 Constructor......");
    }
}
class Main{
    public static void main(String[] args){
        Derived2 scr = new Derived2();
        
    }
}
//Output -   Base-->Derived1-->Derived2
