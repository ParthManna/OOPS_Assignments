class Student{
	int roll;
	String name;
	int[] marks;
	
	public Student(int r,String n,int[] marks){
		this.roll = r;
		this.name = n;
		this.marks = marks;
	}

	int getAverage(){
		int sum=0;
		for(int i : marks)	sum += i;
		return sum/marks.length;
	}
	void display(){
		System.out.println("Name:"+name);
		System.out.println("Roll:"+roll);
		System.out.print("Marks:");
		for(int i=0; i<marks.length; i++)	System.out.print(marks[i]+" ");
		System.out.println();
	}
}

class p15{

	public static void main(String[] args){
		Student[] s1 = new Student[3];
	
		s1[0] = new Student(1, "Partha", new int[]{80,85,90});
		s1[1] = new Student(2, "Anwesha", new int[]{95,85,80});
		s1[2] = new Student(3, "sayak", new int[]{90,85,95});

		Student bestS = s1[0];

		for(Student s : s1)
			if(s.getAverage() > bestS.getAverage())	bestS = s;
		System.out.println("Best Student Details:");
		bestS.display();
	}
}
