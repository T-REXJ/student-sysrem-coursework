package coursework;
import java.util.ArrayList;
import java.util.Date;
public abstract class AbstractStudent implements Student{
   protected  StudentID ID;
  protected Name name;
  private  String gender;
  private  Date birth;
  protected  String type;
 protected   String supervisor;
 protected   ArrayList<Module> modules ;//= new ArrayList<Module>();
// private int age;
    public AbstractStudent(String firstname,String lastname,String gender,Date birth,String type, String superviser){
        
        this.name=new Name(firstname,lastname);
        //this.ID.setID(name);
        this.ID = new StudentID();
        this.gender=gender;
        this.setBirth(birth);
        this.type = type;
        this.supervisor = superviser;
        this.modules = new ArrayList<Module>();
       // if (this.getBirth() != null) {
    //    this.age = (int)((Temporal) this.getBirth()).until(LocalDate.now(), ChronoUnit.YEARS);
       //}
        	       
    }
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
 
  
	
}
