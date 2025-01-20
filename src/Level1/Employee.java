package Level1;

public class Employee {
    static String companyName;
    String name;
    final String id;
    String designation;
    Employee(String companyName,String name,String id,String designation){
        this.companyName=companyName;
        this.name=name;
        this.id=id;
        this.designation=designation;
    }

    void displaycompanyName() {
        if (this instanceof Employee) {
            System.out.println("Employee Name : " + companyName);
            System.out.println("Name: " + name);
            System.out.println("Id : " + id);
            System.out.println("Designation : "+designation);
        }
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Capegemini","Mohan","Capgemini43","Associate Software Engineer");
        employee.displaycompanyName();


    }
}
