public class StudentGradesTest {
    public static void main(String[] args) {
        StudentGrades sg1 = new StudentGrades("Amanda", new double[]{3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5});
        StudentGrades sg2 = new StudentGrades("james", new double[]{2.0, 3.0, 2.0, 4.5, 4.5});
        StudentGrades sg3 = new StudentGrades("james", 5);
        StudentGrades sg4 = new StudentGrades("james");


        // sg1.displayRecord();
        // sg2.displayRecord();
        // sg3.displayRecord();
        sg4.displayRecord();
    }
}
