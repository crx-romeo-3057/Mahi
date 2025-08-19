import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student {
    private String id;
    private String name;
    private String course;
    public Student(String id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Course: " + course;
    }
}
public class CollegeManagement {
    private static List<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== College Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. List All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    listStudents();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        Student student = new Student(id, name, course);
        students.add(student);
        System.out.println("Student added successfully!");
    }
    private static void viewStudent() {
        System.out.print("Enter Student ID to view: ");
        String id = scanner.nextLine();
        for (Student s : students) {
            if (s.getId().equals(id)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found!");
    }
    private static void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            System.out.println("List of all students:");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }
}