class Employee{
    int salary;
    String name;
    public int getsalary(){
       return salary;    
        }
   public String getName(){
       return name;
   }
   public void setname( String n){
      this.name = n;
}
}
class Main{
    public static void main(String[] args){
        Employee scr = new Employee();
        scr.salary= 50000;
        scr.setname("Anmol");
        System.out.println("Name " + scr.getName());
         System.out.println("Salary " + scr.getsalary());
    }
}
