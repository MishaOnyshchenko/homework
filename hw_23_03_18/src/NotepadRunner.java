import java.util.*;

/*2. Реализовать блокнот, со следующими ф-циями:
добавить запись, удалить, редактировать.
В блокноте пишем:
ФИО, телефон, адрес, дату рождения, место работы, возврат, а также пол и страну проживания.*/
public class NotepadRunner {
    public static void main(String[] args) {
        ArrayList<Notepad> notepad = new ArrayList<>();

        addNote(notepad);
        System.out.println(notepad);

        addNote(notepad);
        System.out.println(notepad);

        deleteNote(notepad);
        System.out.println(notepad);

        correctNote(notepad);
        System.out.println(notepad);

    }

    public static void addNote(ArrayList<Notepad> notepad) {
        Notepad note = new Notepad();

        System.out.print("Enter a name: ");
        Scanner scn = new Scanner(System.in);
        note.setName(scn.nextLine());

        System.out.print("Enter age: ");
        Scanner scn2 = new Scanner(System.in);
        note.setAge(scn2.nextInt());

        System.out.print("Enter a gender: ");
        Scanner scn3 = new Scanner(System.in);
        note.setGender(scn3.nextLine());

        notepad.add(note);
    }

    public static void deleteNote(ArrayList<Notepad> notepad) {
        Notepad note = new Notepad();

        System.out.print("Enter a name for delete: ");
        Scanner scn = new Scanner(System.in);
        for (Notepad n : notepad) {
            if (n.getName().equals(scn.nextLine())) {
                notepad.remove(n);
            }
        }
    }

    public static void correctNote(ArrayList<Notepad> notepad) {
        System.out.print("Enter a name for correction: ");
        Scanner scn = new Scanner(System.in);
        for (Notepad n : notepad) {
            if (n.getName().equals(scn.nextLine())) {
                notepad.remove(n);

                Notepad note = new Notepad();

                System.out.print("Enter a name: ");
                Scanner scn1 = new Scanner(System.in);
                note.setName(scn1.nextLine());

                System.out.print("Enter age: ");
                Scanner scn2 = new Scanner(System.in);
                note.setAge(scn2.nextInt());

                System.out.print("Enter a gender: ");
                Scanner scn3 = new Scanner(System.in);
                note.setGender(scn3.nextLine());

                notepad.add(note);
            }
        }
    }
}
