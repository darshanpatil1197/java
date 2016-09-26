package in.ac.kletech.university;

public class University {
	private String scolCode;
	private String scolName;
	int ischi=0;
	School[] schools= new School[8];
	
	
	public String getColCode() {
		return scolCode;
	}

	public String getsName() {
		return scolName;
	}

	University (String scolCode, String scolName) {
		this.scolCode=scolCode;
		this.scolName=scolName;
	}
	
	void addProgram(String sprogramCode, String sschoolCoordinator, int inoOfStud, int inoOfStaff){
		if(inoOfStud>120)
			System.out.println("Cannot take more than 120 students\n");
		else
			schools[ischi++]=new School(sprogramCode, sschoolCoordinator, inoOfStud, inoOfStaff);
	}
	
	int getSchoolstrength() {
		int total=0;
		for(int i=0;i<schools.length;i++)
		{
			if(schools[i]!=null)
			{		
				total=total+schools[i].getInoOfStud();
				System.out.println("no. of students in "+ schools[i].getSprogramCode() + "= " + schools[i].getInoOfStud());
			}
		}
		return total;
	}
	
	
	
	class School{
		private String sprogramCode;
		private String sschoolCoordinator; 
		private int inoOfStud;
		private int inoOfStaff;
		
		
		
		public String getSprogramCode() {
			return sprogramCode;
		}



		public String getSschoolCoordinator() {
			return sschoolCoordinator;
		}



		public int getInoOfStud() {
			return inoOfStud;
		}



		public int getInoOfStaff() {
			return inoOfStaff;
		}



		School(String sprogramCode, String sschoolCoordinator, int inoOfStud, int inoOfStaff){
			this.sprogramCode=sprogramCode;
			this.sschoolCoordinator=sschoolCoordinator;
			this.inoOfStud=inoOfStud;
			this.inoOfStaff=inoOfStaff;
		}
	}

}
