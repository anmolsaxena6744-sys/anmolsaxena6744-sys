class Rectangle{
    int length;
    int breadth;
    void setRectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }
    int area(){
        return length * breadth;
        }
    int perimeter(){
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
