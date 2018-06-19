package Man;

public class Student extends Man {

    private int yearOfStudy;

    public Student(int yearOfStudy) {
        yearOfStudy = yearOfStudy;
    }

    public int increaseYearOfStudy(int year){
        return yearOfStudy + year;
    }
}

