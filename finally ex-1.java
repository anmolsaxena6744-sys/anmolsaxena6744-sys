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
}
}
