class Cylinder{
    private int radius;
    private int height;
public Cylinder(int R , int H){
    this.radius = R;
    this.height = H;
}
public int getradius(){
    return radius;
}
public int getheight(){
    return height;
}
}
class Main{
    public static void main(String[] args){
        Cylinder scr = new Cylinder(2,3);
        
    System.out.println("Radius " + scr.getradius());
    System.out.println("Height " + scr.getheight());
    }
}
