class Main{
    public static int greet(){
        try{
            int a = 10;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
        System.out.println(e);
    }
        finally{
            System.out.println("Finally always executed");
        }
        return 0;
}

public static void main(String[] args){
    int k = greet();
    System.out.println(k);
    
    int d = 7;
    int f = 9;
    while(true){
        try{
            System.out.println(d/f);
        }
        catch(Exception e){
            System.out.println(e);
            break;
        }
        finally{
            System.out.println("Again always executed even break is applied " + f);
        }
         
        f-- ;
    }
}
}
