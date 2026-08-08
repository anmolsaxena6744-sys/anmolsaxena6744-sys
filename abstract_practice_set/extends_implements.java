interface BasicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("jumpinng.....");
    }
    void bite(){
        System.out.println("bitingggg.....");
    }
}
class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eatinggg.....");
    }
  public void sleep(){
       System.out.println("sleeping.....");
   }
}
class Main{
    public static void main(String[] args){
        Human h = new Human();
        h.jump();
        h.bite();
        h.eat();
        h.sleep();
    }
}
