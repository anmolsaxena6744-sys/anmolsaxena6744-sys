import java.util.Scanner;
class MyException extends Exception{
    @Override
   public String toString(){
       return "I AM toString()";
}
    @Override
    public String getMessage(){
        return "I AM toMessage()";
    }
}
class Main{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        if(a<9){
            try{
               throw new MyException();
              //  throw  new ArithmeticException("This is an Exception");
            }
        
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Finished");
      }  
            System.out.println("Yes Finished");
        }
    }
}import java.util.Scanner;
class MyException extends Exception{
    @Override
   public String toString(){
       return "I AM toString()";
}
    @Override
    public String getMessage(){
        return "I AM toMessage()";
    }
}
class Main{
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        if(a<9){
            try{
               throw new MyException();
              //  throw  new ArithmeticException("This is an Exception");
            }
        
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
            System.out.println("Finished");
      }  
            System.out.println("Yes Finished");
        }
    }
}
