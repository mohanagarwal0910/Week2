package Level1;
class Order{
    String orderId;
    String orderDate;
    Order(String orderId,String orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

}
class ShippedOrder extends Order{
    String trackingNumber;
    ShippedOrder(String orderId,String orderDate,String trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }
}
class DeliverOrder extends ShippedOrder{
    String deliveryDate;
      DeliverOrder(String orderId,String orderDate,String trackingNumber,String deliveryDate){
          super(orderId,orderDate,trackingNumber);
          this.deliveryDate=deliveryDate;
      }
      void getOrderStatus(){
          System.out.println("Order ID: "+orderId);
          System.out.println("Order Date"+orderDate);
          System.out.println("Tracking Number: "+trackingNumber);
          System.out.println("Delivery Date"+deliveryDate);
    }
}

public class OnlineRetailManagement {
    public static void main(String[] args) {
       DeliverOrder deliverOrder=new DeliverOrder("ID56372","09.10.2024","T5y66","2.11.2024");
       deliverOrder.getOrderStatus();
    }
}
