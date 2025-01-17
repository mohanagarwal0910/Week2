package Level1;

public class CircleArea {
    double radius;
    CircleArea(double radius){
        this.radius=radius;
    }

    public double area() {
        double ar=3.14*Math.pow(radius,2);
        return ar;
    }
    public double circumference(){
        double circum=2*3.14*radius;
        return circum;
    }

    public void display(double a,double ci) {
        System.out.println(a);
        System.out.println(ci);
    }
    public static void main(String[] args) {
        double radius=2.6;
        CircleArea c=new CircleArea(radius);
        double a=c.area();
        double ci=c.circumference();
        c.display(a,ci);
    }
}
