class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<6444){
            System.out.println("Helloooo.....");
            i++;
        }
        
    }
}
class MyThread2 extends Thread{
    @Override
     public void run(){
         int i = 0;
         while(true){
       System.out.println("Byeeeeee.....");
        try{
           Thread.sleep(1000);
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }
       i++;
    
        }
}
}
class MyThread3 extends Thread{
    @Override
     public void run(){
         int i = 0;
         while(true){
       System.out.println("Wait.....");
       try{
           Thread.sleep(100);
       }
       catch(InterruptedException e){
           e.printStackTrace();
       }
       i++;
        }
}
}
public class Main{
    public static void main(String[] args){
        MyThread1 a = new MyThread1();
        MyThread2 b = new MyThread2();
        MyThread3 c = new MyThread3();
        a.start();
        // try{
        //     a.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        b.start();
        c.start();
    }
}
