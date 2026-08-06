class Rectangle{
  private int length;
   private int breadth;
Rectangle(int length , int breadth){
    this.length = length;
    this.breadth = breadth;
}
 public void setlength(int length){
    this.length = length;
}

public int getlength(){
    return length;
}
public void setbreadth(int breadth){
    this.breadth = breadth;
}

public int getbreadth(){
    return breadth;
}
public int Area(){
    return length * breadth ;
}
}
class Cuboid extends Rectangle{
    private int height;
    Cuboid(int length , int breadth , int height){
        super(length , breadth);
        this.height = height;
    }
   public void setheight(int height){
    this.height = height;
}

public int getheight(){
    return height;
}
public int Volume(){
    return Area() * height ;
} 
}
class Main{
    public static void main(String[] args){
        Cuboid scr = new Cuboid(2,3,4);
        System.out.println("Area of Rectangle: " + scr.Area());
        System.out.println("Area of Cuboid: " + scr.Volume());
        
    }
    
}
