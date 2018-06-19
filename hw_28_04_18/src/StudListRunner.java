/*Написать программу помощь учителю. Где вы должны продумать и реализовать следующий  ф-ционал:
У учителя должна быть возможность вести журнал, где будет ФИО студента.
Также должна быть возможность просматривать информацию по студенту. ФИО.
Важно! данные должны сохранятся. Когда я второй и следующие разы запускаю программу,
все то, что я уже заполнял должно остаться. Если что-то отредактировал, так же должно сохраниться.*/

public class StudListRunner {

    public static void main(String[] args) {

        StudListJournal slj = new StudListJournal();

        Student stud1 = new Student(1,"Vasiliy", "Terkin", "Vasek");
        Student stud2 = new Student(2,"Ivan", "Susanin", "Vano");
        Student stud3 = new Student(3, "Alexandr", "Muzychko", "Beliy");

        slj.addStudent(stud1);
        slj.addStudent(stud2);
        slj.addStudent(stud3);

        slj.getStudentList();

        slj.getStudent(2);
    }
}
