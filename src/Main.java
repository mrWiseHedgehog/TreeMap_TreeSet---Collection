import java.util.*;

public class Main {


    public static void main(String[] args) {

        final int maxCharInSurname = 2;

        List<Person> people = new ArrayList<>();
        people.add(new Person("Roy", "Jones Jr", 53));
        people.add(new Person("Mike", "Tyson", 56));
        people.add(new Person("Manny", "Pacquiao", 43));
        people.add(new Person("Miguel", "Cotto", 41));
        people.add(new Person("Floyd", " Money Mayweather", 45));
        people.add(new Person("Otto", "Farengate", 11));
        people.add(new Person("Li", " Sonic", 15));
        people.add(new Person("Gregory", " Monster", 18));

        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] firstSurname = o1.getSurname().split(" ", maxCharInSurname);
            String[] secondSurname = o2.getSurname().split(" ", maxCharInSurname);
            if (firstSurname.length < secondSurname.length) {
                return -1;
            } else if (firstSurname.length > secondSurname.length) {
                return 1;
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        people.removeIf((o1) -> o1.getAge() < 18);
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}