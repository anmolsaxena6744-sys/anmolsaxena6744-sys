abstract class parent{
    public void child1(){
        System.out.println("Say hello");
    }
    parent(){
        System.out.println("I am a constructor of parent class");
    }
    public void child2(){
        System.out.println("Say Bye");
}
}
   
class Uncle extends parent{
     @Override
     public void child2(){
        System.out.println("Say Override");
     }
 public Uncle(){
     System.out.println("I am a constructor of uncle class");
 }
 }
 abstract class grandparent extends parent{
     public void harry(){
         System.out.println("Hello grandpaa");
     }
 }
 public class Main{
     public static void main(String[] args){
         //parent s = new parent(); ---> throughs error
         Uncle a = new Uncle();
         //grandparent b = new grandparent(); --> throughs error
         a.child2();
     }
 }
     
