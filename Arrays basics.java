//Calculate average marks using for-each loop
public class main{
public static void main(String[] args){
int[] marks = { 80 , 90, 20 , 30, 10};
int sum = 0;
for (int i : marks){
sum = sum+i;
}
float average = (float) sum/ marks.length;
System.out.println("Average =" + average);
}
}
