package Level2;

public class Student {
    String name;
    int rollNumber;
    int marks;
    Student(String name,int rollNumber,int marks){
        this.name=name;
        this.rollNumber=rollNumber;
        this.marks=marks;
    }
    public String calculate(){
        if(marks>=80 && marks<=100)
            return "A";
        else if (marks>=70 && marks<80)
            return "B";
        else
            return "C";
    }
    public void display(String grade){
        System.out.println("Name:"+name);
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Marks:"+marks);
        System.out.println("Grade:"+grade);
    }
    public static void main(String[] args) {
        String name="Mohan";
        int rollNumber=61;
        int marks=90;
        Student student=new Student(name,rollNumber,marks);
        String grade=student.calculate();
        student.display(grade);
    }
}
