import entity.Lesson;
import entity.Student;
import management.studentManager;

public class App {
    public static void main(String[] args) throws Exception {

        Lesson lesson1 = new Lesson("Türkçe", "TYT", 1);
        Lesson lesson2 = new Lesson("Matematik", "TYT", 2);
        Lesson lesson3 = new Lesson("Fizik", "AYT", 3);
        Lesson lesson4 = new Lesson("Kimya", "AYT", 4);              
               
        Student student1 = new Student("Berfin",1);
        Student student2 = new Student("Emre",2); 
        
        Student[] students = {student1,student2};
        Lesson[] lessons = {lesson1,lesson2,lesson3,lesson4};   
            
        studentManager studentManager = new studentManager();

        for(Student student : students){
                studentManager.addStudent(student);       
            for(Lesson lesson : lessons){
                studentManager.addLessonToStudent(student, lesson);              
            }
        }  

    }

}
