package Level1;

class Device{
    String deviceId;
    String status;
    Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }

}
class Thermostat extends Device{
    String tempatureSetting;
    Thermostat(String deviceId,String status,String tempatureSetting){
        super(deviceId,status);
        this.tempatureSetting=tempatureSetting;
    }
    void displayStatus(){
        System.out.println("Device Id: "+deviceId);
        System.out.println("Status"+status);
        System.out.println("Set temperature: "+tempatureSetting);
    }
}
public class SmartHome {
    public static void main(String[] args) {
       Thermostat thermostat=new Thermostat("ID143","ON","18 C");
       thermostat.displayStatus();
    }
}
