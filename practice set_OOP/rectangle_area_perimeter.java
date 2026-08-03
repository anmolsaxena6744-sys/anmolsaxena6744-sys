class Rectangle{
    int length;
    int breadth;
   public void setRectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    public int area(){
        return length * breadth;
        }
    public int perimeter(){
        return 2 * (length + breadth);
    }
}
class Main{
    public static void main(String[] args){
        Rectangle rc = new Rectangle();
        rc.setRectangle(2,3);
        System.out.println("Area: " + rc.area());
        System.out.println("Perimeter: " + rc.perimeter());
    }
}
