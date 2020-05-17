package coursework;
import java.util.Date;

public class Manager {
		
	
	public Manager() {
		super();
	} 
	public int noOfStudents(String type) {// number of student
		return StudentFactory.numberofStudent(type);}
	
	public void amendStudenData(StudentID ID,Object studentData) {//xiu gai xin xi
		if (studentData instanceof  Name) {
			Database.map.get(ID).name.setFirstName(((Name) studentData).getFirstName());
			Database.map.get(ID).name.setLastName(((Name) studentData).getLastName());
		}else if(studentData instanceof  Date) {
			Database.map.get(ID).setBirth((Date) studentData);
		}
	}
	public static void terminateStudent(StudentID ID) {
		StudentFactory.numberofStudent(Database.map.get(ID).Type());
		Database.map.remove(ID);
		
		
	}
	public static void register(AbstractStudent student) {
			SmartCard card = new SmartCard(student);
			Database.setCard(student, card);
	}
	
	
	

	}
	
