package entity;
public class Student {
    private String studentName;
    private int studentId;
    private Lesson[] studentLessons ;

    public Student(String studentName, int  studentId){
        this.studentName = studentName;
        this.studentId =studentId;
        }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Lesson[] getStudentLessons() {
        return studentLessons;
    }

    public void setStudentLessons(Lesson[] studentLessons) {
        this.studentLessons = studentLessons;
    }
}
