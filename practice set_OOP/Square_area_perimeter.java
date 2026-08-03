class Square{
    int side;
    void setside(int n){
        this.side = n;
    }
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4 * side;
    }
}
class Main{
    public static void main(String[] args){
        Square scr = new Square();
        scr.setside(5);
        System.out.println("Perimeter: " + scr.perimeter());
         System.out.println("Area: " + scr.area());
    }
}
