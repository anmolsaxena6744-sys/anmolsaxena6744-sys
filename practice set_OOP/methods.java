
class Cellphone{
    void ringing(){
        System.out.println("phone is ringing....");
    }
    void calling(){
        System.out.println("phone is calling....");
    }
    void vibrating(){
         System.out.println("phone is vibrating....");
    }
}
class Main{
    public static void main(String[] args){
        Cellphone scr = new Cellphone();
        scr.ringing();
        scr.calling();
        scr.vibrating();
    }
}
