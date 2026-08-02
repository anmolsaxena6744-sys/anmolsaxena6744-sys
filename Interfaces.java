interface Bicycle{
    int a = 32;
    void applyBrake(int Decrement);
    void speedup(int Increment);
}
interface HeroBicycle{
    void blowhornkgf();
    void blowhornddlj();
}
class Atlas implements Bicycle,HeroBicycle{
    public void applyBrake(int Decrement){
        System.out.println("poo pooo");
         
     }
      public void speedup(int Increment){
            System.out.println("shuu shuuuu");
         
      }
      public void blowhornkgf(){
          System.out.println("piii piiii");
          
      }
      public void blowhornddlj(){
           System.out.println("tu tuu tuuuu");
          
      }
}
class Main{
    public static void main(String[] args){
        Atlas Anmolcycle = new Atlas();
        Anmolcycle.speedup(1);
        // You can create properties in Interfaces
        System.out.println(Anmolcycle.a);
        // You cannot modify the properties in interfaces as they are final   
        //Anmolcycle.a = 21;    --> shows error because it is final value
        //System.out.println(Anmolcycle.a);
        Anmolcycle.blowhornkgf();
        Anmolcycle.blowhornddlj();
        
    }
}
