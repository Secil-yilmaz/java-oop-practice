public static void main(String[] args) {
    Student s1 = new Student("Naz", 123, "CENG");
    Student s2 = new Student("Ali", 456);

    s1.printInfo();
    s2.printInfo();
}

public class Student {
    String name;
    int number;
    String department;

    public student(String name, int number, String department){
        this.name = name;
        this.number = number;
        this.department;
    }

    public student(String name, int number){
        this.name = name;
        this.number = number;
    }

    public void printInfo(){
        System.out.println(name + " - "+ number +" - "+ department);
        }
    }
}
