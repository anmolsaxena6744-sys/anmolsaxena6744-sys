interface parentInterface{
    void meth1();
    void meth2();
}
interface childInterface extends parentInterface{
    void meth3();
    void meth4();
}
class Sampleclass implements childInterface{
    public void meth1(){
       System.out.println("meth1.....");
    }
     public void meth2(){
       System.out.println("meth2.....");
     }
     public void meth3(){
       System.out.println("meth3.....");
     }
     public void meth4(){
       System.out.println("meth4.....");
     }
    
}
class Main{
    public static void main(String[] args){
       Sampleclass scr = new Sampleclass();
       scr.meth1();
       scr.meth2();
       scr.meth3();
       scr.meth4();
    }
}
