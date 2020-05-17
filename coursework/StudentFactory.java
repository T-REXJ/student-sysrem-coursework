package coursework;

import java.sql.Date;

public class StudentFactory{
		private static int ug;
		private static int pgt;
		//private static DateFormat format1=new SimpleDateFormat("yyyy-MM-dd");         
	//	private static DateFormat format2= new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");    
		 
		 public StudentFactory() {
			 ug = 0;
			 pgt = 0;
			 
		 }
		public static int numberofStudent(String type){
				if(type.equals("UG")) {
					return ug;
			}
			else if (type.equals("PGT")) {
					return pgt;
			}else {
					throw new IllegalArgumentException();
			}
		}
		public int getug() {
			return ug;
		}
		public int getpgt() {
			return pgt;
		}
		public static AbstractStudent getInstance(String firstname,String lastname,String gender,String birth,String type, String superviser) throws Exception  {
			int year = Integer.parseInt(birth.substring(0, 4)) -1900;
			int month = Integer.valueOf(birth.substring(5, 7))-1;
			int day = Integer.valueOf(birth.substring(8, 10));
			Date date  = new Date(year, month, day);
			System.out.println();
			//date = sdf.parse(birth);
			int age = Integer.valueOf(Database.today().substring(0, 4))-Integer.valueOf(birth.substring(0, 4));
			if(type.equals("UG") && age>=17  ) {	
			/**	  try {    
				             Birth = format1.parse(birth);   
				             //Birth = format2.parse(birth); 
				  } catch (ParseException e) {    
				             e.printStackTrace();    
				  }   */
					ug++;
					return new UG(firstname, lastname, gender,date, type, superviser);
					
			}
			else if (type.equals("PGT")&&age>=20) {
					pgt++;
					return new PGT(firstname, lastname, gender, date, type, superviser);
			}//else {
			//		throw new IllegalArgumentException();
			//}
			return null;
		}
		

	public static void main(String[] args) throws Exception{
			StudentFactory sf = new StudentFactory();
			AbstractStudent ug1 ;
			ug1 =  StudentFactory.getInstance("j","y", "male", "1997-09-09","UG", "jack");
			AbstractStudent ug2 = StudentFactory.getInstance("j1","y", "male", "2008-09-06","UG", "jack");
			System.out.println(ug1.Type());
			System.out.println(ug1.getID().studentID);
			//System.out.println(ug2.getID().studentID);
			System.out.println(ug1.name.getName());
			System.out.println(ug1.getBirth());
			Manager.register(ug1);
			System.out.println(Database.map1.get(ug1).getSCN());
			}

}
