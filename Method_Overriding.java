class Ekka{
    public int a;
    
    public int harry(){
        return 4;
    }
public void math1(){
    System.out.println("I am a method 2 of class Ekka ");
}
public void math2(){
    System.out.println("I am a method 3 of class Ekka ");
}
}
class Mikka extends Ekka{
    @Override
public void math2(){
    System.out.println("I am a method 1 of class Mikka ");
}
public void math3(){
    System.out.println("I am a method 2 of class Mikka ");
}
}
class Main{
    public static void main(String[] args){
        Ekka A = new Ekka();
        A.math2();
        Mikka B = new Mikka();
        B.math2();
    }
}
