import java.util.Comparator;

public class DogAgeComparator implements Comparator<Dog>{

    @Override
    public int compare(Dog dog1, Dog dog2) {
        Integer age1 = new Integer(dog1.getAge());
        Integer age2 = new Integer(dog2.getAge());

        return age1.compareTo(age2);
    }
}
