class Main{
    public static void main(String[] args){
        
        // Without try-catch
        
        // int a = 600;
        // int b = 0;
        // int c = a/b;
        // System.out.println(c);
        
        
        // With try-catch
        try{
        
        int a = 600;
        int b = 0;
        int c = a/b;
        System.out.println("The result is: " + c);
        }
        catch(Exception e){
            System.out.println("We failed to divide Reason: ");
            System.out.println(e);
        }
        System.out.println("Program executed ");
    }
}
