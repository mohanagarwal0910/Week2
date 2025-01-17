package Level1;

public class MobilePhone {
    String brand;
    String model;
    int price;
    MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display(){
        System.out.println("Brand Name:"+brand);
        System.out.println("Brand Model:"+model);
        System.out.println("Price"+price);
    }

    public static void main(String[] args) {
        String brand="Samsung";
        String model="A31";
        int price=22000;
        MobilePhone mobile=new MobilePhone(brand,model,price);
        mobile.display();
    }
}
