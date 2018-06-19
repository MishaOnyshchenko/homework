import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student size = new Student();
        size.setSize(40);
        Student [] studArr = new Student[size.getSize()];
        fillStudArr(studArr);

        Student sizeA = new Student();
        sizeA.setSize(12);
        Student [] studArrA = new Student[sizeA.getSize()];

        Student sizeB = new Student();
        sizeB.setSize(15);
        Student [] studArrB = new Student[sizeB.getSize()];

        Student [] studArrMissed = new Student [studArr.length - studArrA.length - studArrB.length];
        fillTheClasses(studArr, studArrA, studArrB, studArrMissed);

        ClassRoom classA = new ClassRoom("A", sizeA.getSize(), studArrA);
        ClassRoom classB = new ClassRoom("B", sizeB.getSize(), studArrB);
        ClassRoom classMissed = new ClassRoom("Missed", studArr.length - studArrA.length - studArrB.length, studArrMissed);

    }

    public static void fillStudArr(Student [] studArr){
        for (int i = 0; i < studArr.length; i++){
            Student myStudent = new Student();
            myStudent.setAge(myStudent.randomAge());
            myStudent.setName(myStudent.randomName());
            studArr[i] = myStudent;
        }
    }

    public static void fillTheClasses(Student [] studArr, Student [] studArrA, Student [] studArrB, Student [] studArrMissed){

        for (int i = 0, j = 0, k = 0, n = 0; i < studArr.length; i++){
            if (j < studArrA.length && studArr[i].getAge() <= 12){
                studArrA[j] = studArr[i];
                j++;
            }
            if ((studArr[i].getAge() > 12 && k < studArrB.length)|| (j >= studArrA.length && k < studArrB.length)){
                studArrB[k] = studArr[i];
                k++;
            }
            if (i >= studArrA.length + studArrB.length){
                studArrMissed[n] = studArr[i];
                n++;
            }
        }
    }

}
