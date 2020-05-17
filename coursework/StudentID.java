package coursework;

import java.util.regex.Pattern;

public class StudentID {
	public String studentID;
	public StudentID() {
		this.studentID = Database.setID();	
	}
	/**public void setID(Student student) {
		this.studentID=Database.setID(student);
	}*/
  public String getID() {
	  return studentID;
  }
	public boolean patternID(String studentID) {
		//String pattern = "(\\^[a-z]\\d{4}$)";
		return Pattern.matches("(\\^[a-z]\\d{4}$)", studentID);
	}
	
}
