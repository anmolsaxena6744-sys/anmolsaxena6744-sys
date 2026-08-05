class Rectangle{
    private int length;
    private int breadth;
  public Rectangle(){
      length = 4;
      breadth = 5;
}
  public Rectangle(int L , int B){
      this.length = L;
      this.breadth = B;
  }
      
      public void display(){
      
  
      System.out.println("Length " + length);
      System.out.println("Breadth " + breadth);
      
  }
  
}
class Main{
    public static void main(String[] args){
        Rectangle scr = new Rectangle();
        Rectangle rcr = new Rectangle(2,9);
        rcr.display();
        scr.display();
    }
}
