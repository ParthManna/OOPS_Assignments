interface Department{
	String deptName="CSE";
	String deptHead="ALOK RANJAN";

	abstract void displayDeptData();
	
}

class Hostel{
	String hostelN;
	String hostelL;
	int rn;
	
	void readHostelData(String hn, String hl,int r){
		hostelN = hn;
		hostelL = hl;
		rn = r;
	}
	
	void displayHostelInfo(){
		System.out.println("Hostel Name:"+hostelN);
		System.out.println("Hostel Location:"+hostelL);
		System.out.println("Room Number:"+rn);
	}
}

class Student extends Hostel implements Department{
	String StudentN,ElectiveS;
	double regno,avgM;
	

	void readStudentInfo(String sn, String Es,double rg, double a){
		StudentN = sn;
		ElectiveS = Es;
		regno = rg;
		avgM = a;
	}

	void displayStudentInfo(){
		System.out.println("Student name:"+StudentN);
		System.out.println("Elective Subject:"+ElectiveS);
		System.out.println("Registration Number"+regno);
		System.out.println("Average Marks"+avgM);
	}

	public void displayDeptData(){
		System.out.println("DeptName:"+deptName);
		System.out.println("DeptHead:"+deptHead);
	}
	
}

class p5{
	public static void main(String[] args){
		System.out.println("Student Information");
		Student s = new Student();
		s.readStudentInfo("Partha", "EIKT", 62, 89);

		Hostel h = new Hostel();

		h.readHostelData("cemkhostel","Kolaghat",3);

		s.displayStudentInfo();
		s.displayDeptData();

		h.displayHostelInfo();
	}
}
