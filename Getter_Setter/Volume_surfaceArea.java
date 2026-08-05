class Cylinder{
    private int radius;
    private int height;
    
   public void setradius(int R){
        this.radius = R;
    }
   public void setheight(int H){
        this.height = H;
    }
    public double surfaceArea(){
        return 2 * 3.14 * radius * (height + radius);
    }
     public double Volume(){
        return 3.14 * radius * radius * height;
    }
}
class Main {
    public static void main(String[] args){
        Cylinder scr= new Cylinder();
        scr.setradius(4);
        scr.setheight(5);
        System.out.println("SurfaceArea " + scr.surfaceArea());
        System.out.println("Volume " + scr.Volume());
    }
}
