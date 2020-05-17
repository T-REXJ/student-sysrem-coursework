package coursework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SmartCardNumber  {
	private String SCN;
	
	public SmartCardNumber(	AbstractStudent student, Date today) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy");
		this.SCN = student.name.getFirstName().substring(0,1) + student.name.getLastName().substring(0,1) + "-" +formatter.format(today);
		
	}
	public String getSCN() {
		return SCN;
	}

	/**public static void setSCN(AbstractStudent student,Date issue) {
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy");
		//Date date = new Date(System.currentTimeMillis());
		//System.out.println(formatter.format(date));
		this.SCN = student.name.getFirstName().substring(0,0) + student.name.getLastName().substring(0,0) + "-" +formatter.format(issue);
		
	}*/
	
}
