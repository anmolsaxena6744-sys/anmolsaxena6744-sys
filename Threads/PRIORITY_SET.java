class Mythr1 extends Thread{
     public Mythr1(String name){
         super(name);
     }
 
 public void run(){
     while(true){
         System.out.println("Thank you " + this.getName());
         }
 }
 }
 class Main{
     public static void main(String[] args){
         Mythr1 t1 = new Mythr1("Harry1 (MOST IMPORTANT)");
         Mythr1 t2 = new Mythr1("Harry2");
         Mythr1 t3 = new Mythr1("Harry3");
         Mythr1 t4 = new Mythr1("Harry4");
         Mythr1 t5 = new Mythr1("Harry5");
         t1.setPriority(Thread.MAX_PRIORITY);
         t2.setPriority(Thread.MIN_PRIORITY);
         t3.setPriority(Thread.MIN_PRIORITY);
         t4.setPriority(Thread.MIN_PRIORITY);
         t5.setPriority(Thread.MIN_PRIORITY);
         
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
         


     }
 }
