interface TVRemote{
    void openTV();
    void offTV();
    void volumeUP();
    void volumeDOWN();
}
interface SmartTVRemote extends TVRemote{
    Void ShowYT();
    Void ShowNetflix();
}
class Main{
    public static void main(String[] args){
       System.out.println("SmartTVRemote inherits TVRemote interfaces..");
    }
}
