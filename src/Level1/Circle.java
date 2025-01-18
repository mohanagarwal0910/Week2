package Level1;

public class Circle {
    double radius;

    Circle(){
        this.radius=2.0;
    }
    Circle(double radius){
        this.radius=radius;
    }

    public void display() {
        System.out.println(radius);
    }
    public static void main(String[] args) {
        double radius=2.6;
        Circle c=new Circle();
        c.display();
        Circle ci=new Circle(radius);
        ci.display();
    }

}
