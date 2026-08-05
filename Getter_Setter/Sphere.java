class Sphere{
    private int radius;
void setradius(int R){
        this.radius = R;
        }
int getradius(){
    return radius;
}
}
class Main{
    public static void main(String[] args){
     Sphere rds = new Sphere();
     rds.setradius(7);
System.out.println("Radius: " + rds.getradius());
}
}

