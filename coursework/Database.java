package coursework;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Database {
	private static String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	protected static Map<StudentID,AbstractStudent> map=new HashMap<>();
	public static  Map<AbstractStudent,SmartCard> map1=new HashMap<>();//id map
	private static  int temp = 0;
	private Map<Student,SmartCard> infomap = new HashMap<>();
	protected ArrayList<Student> list;
	protected ArrayList<UG> UGlist;
	protected ArrayList<PGT> PGTlist;
	public Database() {
		list = new ArrayList<Student>();
		UGlist = new ArrayList<UG>();
		PGTlist = new ArrayList<PGT>();
	}
	public static void setCard(AbstractStudent student,SmartCard card) {
		map1.put(student, card);

}
	public static String setID() {
			int x = temp/9999;
			int i  = (temp%9999)+1;
			String s=Integer.toString(i);
			String formatStr=String.format("%04d", Integer.parseInt(s));
			temp ++;
			return str.substring(x,x+1)+formatStr;
		//	 map.put(str.substring(x,x+1)+formatStr,student);
			// map.put(student, "str.substring(x,x)"+"String.format(\"%04d\", i)");
			// return student.ID = getID(student);
	}
	
//public static String getID(Student student) {//get student's ID
	//		return map.get(student);
//}
public Student getstudent(StudentID id){
			return null;
}
public int studentsnumber() {//number of students
			return map.size();
}
public static String today() {
		Date today =  new Date(System.currentTimeMillis());
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd");
		return formatter.format(today);
}

}
