package Level1;

public class Item {
    String itemCode;
    String itemName;
    int price;
    Item(String itemCode,String itemName,int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;
    }
    public void display(int quantity){
        System.out.println("Item Code:"+itemCode);
        System.out.println("Item Name:"+itemName);
        System.out.println("Item Price:"+price);
        System.out.println("Total cost"+price*quantity);
    }

    public static void main(String[] args) {
        String itemCode="I1";
        String itemName="Mango";
        int price=40;
        int quantity=3;
        Item item=new Item(itemCode,itemName,price);
        item.display(quantity);
    }
}
