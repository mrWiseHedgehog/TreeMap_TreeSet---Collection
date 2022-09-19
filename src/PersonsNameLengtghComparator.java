import java.util.Comparator;

class PersonsNameLengthComparator implements Comparator<Person> {
    private final int maxCharInSurname = 2;

    @Override
    public int compare(Person o1, Person o2) {
        String[] firstSurname = o1.getSurname().split(" ", maxCharInSurname);
        String[] secondSurname = o2.getSurname().split(" ", maxCharInSurname);
        if (firstSurname.length < secondSurname.length) {
            return -1;
        } else if (firstSurname.length > secondSurname.length) {
            return 1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}
