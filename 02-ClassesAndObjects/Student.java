public class Student {
    String name;
    int age;
    String studentIdCard;
    boolean studentIdCardValid;
    int semNumber;
    double avgGrade;

    void sayHello(){
        System.out.println("Hello from "+name+"\n");
    }
    void displayName(){
        System.out.println("Name:  "+name+"\n");
    }
    void displayAge(){
        System.out.println("Age: "+age+"\n");
    }
    void displayInfo(){
        System.out.println("Name: "+name+"\nSemester number: "+semNumber+"\nAverage grade: "+avgGrade+"\n");
    }
    void changeValid(){
        studentIdCardValid = !studentIdCardValid;
    }
    void displayStudentIdCardValid(){
        String valid = (studentIdCardValid) ? "Card is valid" : "Card is invalid";
        System.out.println(valid+"\n");
    }
}