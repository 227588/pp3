public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        // Student s = new Student();
        
        // object manipulation
        // s.name = "Peter";
        // s.age = 21;
        // System.out.println(s.name + " " + s.age);

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Peter";
        s1.age = 21;
        s1.studentIdCard = "12312312";
        s1.studentIdCardValid = true;
        s1.semNumber = 3;
        s1.avgGrade = 4.3;

        s2.name = "John";
        s2.age = 31;
        s2.studentIdCard = "43243243";
        s2.studentIdCardValid = false;
        s2.semNumber = 2;
        s2.avgGrade = 4.6;

        s1.sayHello();
        s1.displayName();
        s1.displayAge();

        s2.sayHello();
        s2.displayName();
        s2.displayAge();

        s1.displayInfo();
        s2.displayInfo();

        s1.changeValid();;
        s2.changeValid();;

        s1.displayInfo();
        s1.displayStudentIdCardValid();
        s2.displayInfo();
        s2.displayStudentIdCardValid();
        
        

    

        
    }
}
