package in.ac.kletech.university;

public class CollegeDemo {

	public static void main(String[] args) {
		University kletech = new University("E30,E241", "KLETECH");
		
		kletech.addProgram("CS", "raj", 120, 20);
		kletech.addProgram("IS", "sham", 60, 15);
		kletech.addProgram("ME", "J", 120, 26);
		kletech.addProgram("CIVIL", "K", 80, 22);
		kletech.addProgram("ARCH", "F", 80, 25);
		kletech.addProgram("EC", "G", 120, 45);
		kletech.addProgram("EE", "H", 60, 25);
		
		System.out.println("kletech total students = " + kletech.getSchoolstrength());
	}

}
