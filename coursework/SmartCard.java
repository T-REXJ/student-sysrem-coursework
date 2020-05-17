package coursework;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SmartCard  {
	private String firstname;
	private String lastname;
	private SmartCardNumber SCN;
	private Date today;
	private StudentID IDinCard;
	
	public SmartCard(AbstractStudent student){
		this.firstname = student.name.getFirstName();
		this.lastname = student.name.getLastName();
		this.today = new Date(System.currentTimeMillis());		
		this.SCN=new SmartCardNumber(student,today);
		this.IDinCard = student.getID();
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFullname() {
		return getFirstname()+" "+getLastname();
	}
	
	public StudentID getID() {
		return IDinCard;
	}
	public String getSCN() {
		return SCN.getSCN();
	}
	public void getIssue() {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		System.out.println(formatter.format(today));
	}
	public void setIssue(Date issue) {
		this.today = issue;
	}
	
}