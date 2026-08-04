class Cylinder{
    int Radius;
    int Height;
 
 void setRadius(int R){
     this.Radius = R;
 }
 int getRadius(){
     return Radius ;
     }
     
     void setHeight(int H){
     this.Height = H;
 }
 
 int getHeight(){
     return Height ;
     
 }
 }
class Main{
    public static void main(String[] args){
        Cylinder scr = new Cylinder();
        scr.setRadius(2);
          scr.setHeight(3);
       System.out.println("Radius: "+scr.getRadius());
       System.out.println("Height: "+scr.getHeight());
    }
}
