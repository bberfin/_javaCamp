package entity;
public class Lesson {
    private String lessonName;
    private String lessonType;
    private int lessonId;

    public Lesson(String lessonName,String lessonType,int lessonId){
        this.lessonName = lessonName;
        this.lessonType = lessonType;
        this.lessonId = lessonId;
    }

    public int getLessonId(){
        return lessonId;
    }

    public void setLessonId(int lessonId){
        this.lessonId=lessonId;
    }

    public String getLessonName(){
        return lessonName;
    }

    public void setLessonName(String lessonName){
        this.lessonName=lessonName;
    }

    public String getLessonType(){
        return lessonType;
    }

    public void setLessonType(String lessonType){
        this.lessonType=lessonType;
    }

}
