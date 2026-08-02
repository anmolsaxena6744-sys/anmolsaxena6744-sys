public class Main{
    static float average(int... arr){
        int sum = 0;
        for(int i : arr)
            sum = sum+i;
            return (float) sum/arr.length;
        
    }
    public static void main(String[] args){
        System.out.print(average(5,5,5));
    }
}
