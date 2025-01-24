package Level1;

class Animal{
    String name;
    int age;
    Animal(String name,int age){
           this.age=age;
           this.name=name;
    }
    void makeSound(){
        System.out.println("print sound");
    }
}
class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Bark");
    }
    void display(){
        System.out.println("Name of dog: "+name);
        System.out.println("Age: "+age);
    }
}
class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Meow");
    }
    void display(){
        System.out.println("Name of Cat: "+name);
        System.out.println("Age: "+age);
    }
}
class Bird extends Animal{
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound(){
        System.out.println("Chirps");
    }
    void display(){
        System.out.println("Name of Bird: "+name);
        System.out.println("Age: "+age);
    }
}
public class AnimalDetails {
    public static void main(String[] args) {
        Dog dog=new Dog("Nishu",22);
        dog.display();
        dog.makeSound();
        Cat cat=new Cat("Mona",20);
        cat.display();
        cat.makeSound();
        Bird bird=new Bird("Toota",24);
        bird.display();
        bird.makeSound();
    }
}
