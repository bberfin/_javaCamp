public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Berfin");
		student1.setLastName("Acikgoz");
		student1.setEmail("bbbb@gmail.com");
		student1.setStudentNo(1204);
		student1.setGettingEducation(true);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Songul");
		student2.setLastName("Acikgoz");
		student2.setEmail("ssss@gmail.com");
		student2.setStudentNo(2314);
		student2.setGettingEducation(false);		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		instructor1.setEmail("eeee@gmail.com");
		instructor1.setField("software");
	    instructor1.setDescription("He has Microsoft Certified Trainer (MCT), PMP and ITIL certificates.");

	    
	    StudentManager studentManager = new StudentManager();
	    System.out.println("*********************************************************");	    
	    studentManager.add(student1);
	    studentManager.information(student1);	    
	    studentManager.addCourse(student1, "JAVA + REACT");
	    System.out.println("*********************************************************\n");

	    System.out.println("*********************************************************");
	    studentManager.add(student2);
	    studentManager.information(student2);	    
	    studentManager.addCourse(student2, "C# + ANGULAR");	
	    System.out.println("*********************************************************\n");
	    
	    InstructorManager instructorManager = new InstructorManager();	    
	    System.out.println("*********************************************************");	    
	    instructorManager.add(instructor1);
	    instructorManager.information(instructor1);
	    instructorManager.addField(instructor1, "introduction to programming");
	    System.out.println("*********************************************************\n");	    
	    
	    System.out.println("*********************************************************\n");	 
	    studentManager.delete(student2);
	    
	}

}