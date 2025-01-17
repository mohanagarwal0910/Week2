package Level1;

public class Employee {
    String name;
    int salary;
    String id;
    Employee(String name,int salary,String id){
        this.name=name;
        this.salary=salary;
        this.id=id;
    }

    public void display() {
        System.out.println("Employee name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Employee salary:"+salary);
    }

    public static void main(String[] args) {
        String name="Mohan";
        int salary=70000;
        String id="Capgemini0910";
        Employee e=new Employee( name, salary,id);
        e.display();
    }
}
