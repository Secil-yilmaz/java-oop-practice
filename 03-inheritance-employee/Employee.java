public class Employee{
    String name;
    double salary;

    public void showInfo(){
       System.out.println(name + " - " + salary); 
    }
}

class Developer extends Employee{
    String language;

   public void showInfo(){
    super.showInfo();
    System.out.println("Language: "+ language);
   } 
}

class Manager extends Employee{
    int teamSize;

    public void showInfo(){
        super.showInfo();
        System.out.println("Team size: "+ teamSize);
    }
 }
