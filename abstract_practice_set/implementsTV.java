interface TVRemote{
    void openTV();
    void offTV();
    void volumeUP();
    void volumeDOWN();
}
class TV implements TVRemote{ 
    public void openTV(){
        System.out.println("Open the TV...");
     }
  public  void offTV(){
         System.out.println("Off the TV...");
    }
  public  void volumeUP(){
       System.out.println("Volume Up...");
    }
   public void volumeDOWN(){
       System.out.println("Volume DOWN...");
    }
}
class Main{
    public static void main(String[] args){
        TV tv = new TV();
        tv.openTV();
        tv.offTV();
        tv.volumeUP();
        tv.volumeDOWN();
    }
}
