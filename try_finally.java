class Main{
    public static void main(String[] args){
        try{
            System.out.println(50/10);
        }
        finally{
            System.out.println("yes this is finally");
        }
        try{
            System.out.println(50/0);
        }
        finally{
            System.out.println("yes this is finally with Exception in try block");
        }
    }
}
