abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class Smartphone extends Telephone{
   public void ring(){
       System.out.println("Smartphone is ringing...");
   }
   public void lift(){
       System.out.println("Smartphone call is picked up...");
   }
   public void disconnect(){
       System.out.println("Smartphone call is disconnected...");
   }
    public void connected(){
       System.out.println("Smartphone call is connected...");
   }
}
class Main{
    public static void main(String[] args){
        Telephone sm = new Smartphone();
        sm.ring();
        sm.lift();
        sm.disconnect();
    }
}
