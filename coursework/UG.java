package coursework;

import java.util.Date;

public class UG extends AbstractStudent {

	public UG(String firstname,String lastname,String gender,Date birth,String type, String superviser){
		super(firstname, lastname, gender, birth, type, superviser);
		
	}
	
	
	  public void allModules() {
	    	for(int i = 0;i<modules.size();i++) 
	    	System.out.println(modules.get(i).toString());
			
	    }
	    public double allCredits() {
	    	double all = 0;
	    	for(int i = 0;i<modules.size();i++) 
	    		{all = modules.get(i).getModuleCredit()+all;}
	    	return all;
	    }
	
	@Override
	public StudentID getID() {
		// TODO Auto-generated method stub
			return ID;
}

	@Override
	public String Type() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void Listmodules() {
		// TODO Auto-generated method stub
		allModules();
	}

	@Override
	public boolean Pass() {
		// TODO Auto-generated method stub
		return (allCredits()>120);
	}

	@Override
	public String Supervisor() {
		// TODO Auto-generated method stub
		return supervisor;
	}



	public String getName() {
		// TODO Auto-generated method stub
		return this.name.getName();
	}



	}



