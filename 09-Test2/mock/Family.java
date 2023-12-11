import java.util.Arrays;

public class Family {
    public Person[] lista;

    public Family(Person[] people) {
        lista=people;
    }

    public String toString() {
        return "Family [lista=" + Arrays.toString(lista) + ", index=]";
    }

    public int adults(){
        int counter = 0;
        for (Person person : lista) {
            if(person.getAge()>=18)
                counter++;
        }
        return counter;
    }
    
    public static void main(String[] args) {
        Person p1 = new Person("imie", 2);
        Person p2 = new Person("imi2", 4);
        Person p3 = new Person("imi5", 55);
        Person[] peopleArray = {p1,p2,p3};
        Family f1 = new Family(peopleArray);
        System.out.println(f1.adults());
    }
}
