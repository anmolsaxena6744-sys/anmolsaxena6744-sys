class Main{
    static int sum(int n){
        int s = 0;
        for(int i =1; i<=n; i++)
         s = s + i;
         return s;
        
    }
    public static void main(String[] args){
       System.out.println(sum(5));
    }
}
