package Level1;

public class Person {
    String name;
    int age;
    //Default Contructor
    Person(){
        this.name="Mohan";
        this.age=23;
    }
    //Copy Constructor
    Person(Person person){
        this.name=person.name;
        this.age= person.age;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }

    public static void main(String[] args) {
        Person per=new Person();
        per.display();
        Person pers=new Person(per);
        pers.display();
    }
}
