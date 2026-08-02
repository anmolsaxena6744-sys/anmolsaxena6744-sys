public class Main{
    static void star(int n){
    if(n==0)
    return;
 
    for(int i =1; i<=n ; i++)
    System.out.print("*");
    System.out.println();
    star(n-1);
    }
    public static void main(String[] args){
        star(5);
    }
}
