class Circle{
    double radius;
 public void setRadius(double r){
     this.radius = r;
 }
     public double area(){
         return 3.14 * radius * radius;
     }
     public double perimeter(){
         return 2 * 3.14 * radius;
     }
}
class Main{
public static void main(String[] args){
    Circle csr = new Circle();
    csr.setRadius(3);
    System.out.println("Area: " + csr.area());
     System.out.println("Perimeter: " + csr.perimeter());
}    
}
