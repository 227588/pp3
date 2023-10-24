public class PersonTest {
        public static void main(String[] arg){
            Person p1 = new Person("Peter", 45, 165);
            Person p2 = new Person("John", 65, 175);
            Person p3 = new Person("Lukas", 95, 185);

            p1.calculateBMI();
            p1.displayRecord();
            p2.calculateBMI();
            p2.displayRecord();
            p3.calculateBMI();
            p3.displayRecord();
        }
}
