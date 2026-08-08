abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write with Fountain Pen");
    }
    void refill(){
        System.out.println("refill with a FountainPen");
    }
    void changeNib(){
        System.out.println("Change the Nib");
    }
}
public class Main{
    public static void main(String[] args){
        FountainPen fou = new FountainPen();
        fou.write();
        fou.refill();
        fou.changeNib();
    }
}
