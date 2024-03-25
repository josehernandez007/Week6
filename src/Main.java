import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", "1234 Chicago Ave"));
        students.add(new Student(5, "Jack", "1234 Cermak Rd"));
        students.add(new Student(3, "Crystal", "1234 26th St"));
        students.add(new Student(2, "Joe", "7890 Pine St"));
        students.add(new Student(4, "Desiree", "6789 Oak St"));
        students.add(new Student(6, "Maria", "1357 Cedar Blvd"));
        students.add(new Student(7, "George", "2468 Birch St"));
        students.add(new Student(8, "Heather", "5678 Elm St"));
        students.add(new Student(9, "Patrick", "1357 Spruce St"));
        students.add(new Student(10, "Jose", "2468 Palm St"));

        System.out.println("Original list of students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by roll number using selection sort
        System.out.println("\nStudents sorted by roll number:");
        SelectionSort.selectionSort(students, new SortByRollno());
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by name using selection sort
        System.out.println("\nStudents sorted by name:");
        SelectionSort.selectionSort(students, new SortByName());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}