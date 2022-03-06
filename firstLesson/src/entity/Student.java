package entity;
public class Student {
    public String studentName;
    public int studentId;
    public Lesson[] studentLessons ;

    public Student(String studentName, int  studentId){
        this.studentName = studentName;
        this.studentId =studentId;
        }
}
