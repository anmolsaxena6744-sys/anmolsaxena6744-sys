class Circle{
  private double radius;
  

Circle(double radius){
    this.radius = radius;
    
}

 public void setradius(double radius){
     this.radius = radius;
 }
 public double getradius(){
     return radius;
 }
 public double area(){
     return 3.14 * radius * radius;
 }
    
}
class Cylinder extends Circle{
    private double height;
    
    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public void setheight(double height){
        this.height = height;
    }
    public double getheight(){
        return height;
    }
     double Volume(){
        return area() *height;
    }
    
}
class Main{
    public static void main(String[] args){
        Cylinder scr = new Cylinder(7,9);
        
        System.out.println("Area of Circle : " + scr.area());
        System.out.println("Volume of Cylinder : " + scr.Volume());
    }
}
