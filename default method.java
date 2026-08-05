
interface myCamera{
    void takephoto();
    void recordvedio();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void taking4kvedio(){
        greet();
        System.out.println("Record 4k vedio");
    }
    default void taking2kvedio(){
        System.out.println("Record 2k vedio");
    }
}
interface mywifi{
    String[] getnetworks();
    void connectnetworks( String networks);
}
class mycellphone{
    void callnumber(int number){
    System.out.println("calling "+ number);
    }
    void pickcall(){
        System.out.println("Connecting.....");
    }
    }
    class Smartphone extends mycellphone implements myCamera,mywifi{
       public void takephoto(){
           System.out.println("Taking snap");
       }  
       public void recordvedio(){
           System.out.println("Taking vedio");
       }  
        public String[] getnetworks(){
            System.out.println("getting list of networks");
            String[] networks = { "wifi1" , "wifi2", "wifi3", "wifi4" };
            return networks;
    }
         public void connectnetworks( String networks){
             System.out.println("connecting to "  +  networks);
         }
    }
    class Main{
        public static void main(String[] args){
            Smartphone scr = new Smartphone();
             scr.taking4kvedio();
             scr.taking2kvedio();
             
             //scr.greet(); ---> throughs an error..
            String[] ar = scr.getnetworks();
            for( String item:ar){
                System.out.println(item);
            }
           
            scr.connectnetworks("ip networks");
            scr.callnumber(83);
            scr.pickcall();
            scr.takephoto();
            scr.recordvedio();
        }
    }
