package bitlab.spring.firstspring.spring1.db;

import java.util.ArrayList;

public class DBManager {
    static ArrayList<Student> students = new ArrayList<>();

    static int id = 6;

    static {
        students.add(new Student(0, "Ilyas", "Zhuanyshev", 88, "B"));
        students.add(new Student(1, "Serik", "Serikov", 91, "A"));
        students.add(new Student(2, "Erik", "Erikov", 65, "C"));
        students.add(new Student(3, "Nurzhan", "Kaliyev", 99, "A"));
        students.add(new Student(4, "Yedil", "Yedil", 81, "B"));
        students.add(new Student(5, "Karina", "Serzhanova", 51, "D"));
    }

    public static ArrayList<Student> getStudents() {
        return students;
    }

    public static void addStudent(Student student) {
        if (student.getExam() >= 90) {
            student.setMark("A");
        } else if (student.getExam() >= 75) {
            student.setMark("B");
        } else if (student.getExam() >= 60) {
            student.setMark("c");
        } else if (student.getExam() >= 50) {
            student.setMark("D");
        } else {
            student.setMark("F");
        }

        student.setId(id);
        id++;
        students.add(student);
    }
}
