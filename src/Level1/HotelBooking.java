package Level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    HotelBooking(){
        this.guestName="Mohan";
        this.roomType="AC";
        this.nights=2;
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;;
    }
    HotelBooking(HotelBooking previous){
        this.guestName=previous.guestName;
        this.roomType=previous.roomType;
        this.nights=previous.nights;
    }
    void display(){
        System.out.println("Guest Name :"+guestName);
        System.out.println("Room Type :"+roomType);
        System.out.println("Nights :"+nights);
    }

    public static void main(String[] args) {
        HotelBooking person1=new HotelBooking();
        person1.display();
        String guestName="Kapil";
        String roomType="AC";
        int nights=3;
        HotelBooking person2=new HotelBooking(guestName,roomType,nights);
        person2.display();
        HotelBooking person3=new HotelBooking(person2);
        person3.display();
    }
    
}
