package Level1;
class Emmployee{
    String name;
    String id;
    int salary;
    Emmployee(String name,String id,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("Details display");
    }
}
class Manager extends Emmployee{
    int teamSize;
    Manager(String name,String id,int salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
    @Override
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Team Size: "+teamSize);
    }
}
class Developer extends Emmployee{
    String programmingLanguage;
    Developer(String name,String id,int salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Programming Language: "+programmingLanguage);
    }
}
class Intern extends Emmployee{
    Intern(String name,String id,int salary){
        super(name,id,salary);
    }
    @Override
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Manager manager=new Manager("Mohan","Capgemini29",50000,10);
        manager.display();
        Developer developer=new Developer("Nimish","Capgemini9",30000,"Java");
        developer.display();
        Intern intern=new Intern("Ram","Capgemini2",10000);
        intern.display();
    }
}
