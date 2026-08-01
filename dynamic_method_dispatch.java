class Phone{
    public void A(){
        System.out.println("Turning on the phone");
    }
    public void On(){
        System.out.println("Calling");
    }
    
}
class Smartphone extends Phone{
    @Override
    public void On(){
        System.out.println("Play music");
    }
    public void B(){
        System.out.println("Play games");
        
    }
    
}
class Main{
    public static void main(String[] args){
        Phone scr = new Smartphone();
        scr.A();
        scr.On();
    }
}
