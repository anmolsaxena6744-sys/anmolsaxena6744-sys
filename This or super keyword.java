class Hlo{
    int a;
    
    public int getA(){
        return a;
    }
    
    Hlo(int a){
        this.a = a;
    }
}
class  Bye extends Hlo{
    Bye(int c){
        super(c);
        System.out.println(" Bye class constructor ");
        
    }
}
        public class Main{
            public static void main(String[] args){
                Hlo A = new Hlo(5);
                Bye B = new Bye(6);
                System.out.println(A.getA());
                
            }
        }
        
