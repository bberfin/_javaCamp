package management;

import entity.Lesson;
import entity.Student;

public class studentManager {

        public void addStudent(Student student){
            System.out.println("student "+student.getStudentName()+" is added.");
        }

        public void addLessonToStudent(Student student, Lesson lesson){

            System.out.println(student.getStudentName()+" : "+lesson.getLessonName());
        }
    
    
}
