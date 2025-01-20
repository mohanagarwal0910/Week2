package Level1;

public class Product {
    static String productName;
    double price;
    double quantity;
    static double discount;
    final String productId=" ID 1 ";
    double updatePrice=0.0;
    Product(String productName,double price,double quantity,double discount){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.discount=discount;
    }
    void updateDiscount(){
        updatePrice=price-(discount/100.0)*price;
    }
    void displayproductprice() {
        if (this instanceof Product) {
            System.out.println("Product neme : " + productName);
            System.out.println("price: " + price);
            System.out.println("quantity : " + quantity);
            System.out.println("discount : "+discount);
            System.out.println("Updated Price"+updatePrice);
        }
    }

    public static void  main(String[] args) {
        Product product=new Product("Sugar",50.0,3.0,5.0);
        product.updateDiscount();
        product.displayproductprice();



    }
}
