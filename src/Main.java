import java.util.*;

public class Main {


    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Roy", "Jones Jr", 53));
        people.add(new Person("Mike", "Tyson", 56));
        people.add(new Person("Manny", "Pacquiao", 43));
        people.add(new Person("Miguel", "Cotto", 41));
        people.add(new Person("Floyd", " Money Mayweather", 45));

        Collections.sort(people, new PersonsNameLengthComparator());
        System.out.println(people);
    }
}