import java.util.Scanner; 


public class StudentGrades {

    String studentName;
    double[] grades;

    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        grades = new double[numberOfGrades];
        for(int i=0; i<numberOfGrades; i++){
            grades[i]=((int)(Math.random()*9)*0.5)+2.0;
        }
    }

    public StudentGrades(String name){
        this.studentName = name;
        double[] array = new double[100];
        int index = 0;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter grades, press Enter to add, Write q to end ");
        String input;
        while(true){
            System.out.println("Grade: ");
            input = myObj.nextLine();  // Read user input
            if(input.equals("q"))
                break;
            array[index++]=Double.valueOf(input);
            // System.out.println(Double.valueOf(input).getClass().getName());
            // System.out.println(Double.parseDouble(input));
            // Double d = 3.3;
            // System.out.println(d.getClass().getName());

        }
        grades = new double [index];
        for(int i=0; i<index; i++){
            grades[i]=array[i];
        }

     
        // String input;
        // Scanner sc = new Scanner(System.in);  // Create a Scanner object
        // System.out.println("Enter username");
        // input = sc.nextLine();  // Read user input
        // System.out.println(input.equals("q"));

    }

    public double lowestGrade(){
        double lowestGrade = grades[0];
        for(double grade : grades){
            lowestGrade = (lowestGrade>grade)?grade:lowestGrade;
        }
        return lowestGrade;
    }
    public double highestGrade(){
        double highestGrade = grades[0];
        for(double grade : grades){
            highestGrade = (highestGrade<grade)?grade:highestGrade;
        }
        return highestGrade;
    }
    public int numberOfGrades(){
        return grades.length;
    }
    public void displayRecord(){
        double sum = 0;
        String listOfGrades = "";
        for(double grade : grades){
            sum+=grade;
            listOfGrades+=grade+", ";
        }

        System.out.printf("\n\n\nName: %s\nGrades: %s\nLowest grade: %s\nHighest grade: %s\nGrade point average: %s\n", studentName, listOfGrades, lowestGrade(), highestGrade(), (double)sum/grades.length);
    }
}