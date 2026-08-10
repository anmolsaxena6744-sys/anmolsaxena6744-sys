class Mythread extends Thread{
    public Mythread(String name){
        super(name);
    }
    public void run(){
        
        System.out.println("Thanku Sir");
    }
}
class Main{
    public static void main(String[] args){
        Mythread t1 = new Mythread("Anmol Saxena");
        t1.start();
        System.out.println("My Thread ID IS " + t1.getId());
        System.out.println("My Thread Name IS " + t1.getName());
    }
}
