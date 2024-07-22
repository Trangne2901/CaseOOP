import java.util.Arrays;

public class Course {
    private String courseName;
    private String courseCode;
    private Student[] students;

    public Course() {
        students = new Student[0];
    }

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new Student[0];
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    int size;

    public Student[] addNewStudent(Student newStudent) {
        students = Arrays.copyOf(students, students.length + 1);
        students[size] = newStudent;
        size++;
        return students;
    }

        public void showStudent() {
        for (int i = 0; i< students.length; i++) {
            System.out.println(students[i].getName() + "  "+ students[i].getAge() + "  "+students[i].getStudentID() );
        }
    }
//    public void showStudent() {
//        for (Student i : students) {
//            System.out.println(i);
//        }
//    }

}
