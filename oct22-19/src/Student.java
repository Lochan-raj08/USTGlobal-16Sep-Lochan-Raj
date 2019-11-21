
public class Student {
	String name;
	String usn;
	int marks;
	int age;
	int YOP;
	
	public Student(String name, String usn, int marks,int age, int YOP) {
		this.name =  name;
		this.usn = usn;
		this.marks = marks;
		this.age = age;
		this.YOP = YOP;
		
	}
	void read () {
		System.out.println("Name: " +name + "USN: "+usn+"Marks: "+marks+"Age: "+age+"YOP: "+YOP);
	}
	public static void main(String[] args) {
		Student s = new Student("Shareef", "$MC15", 99, 21, 2019);
		s.read();
		
		Student s1 = new Student("Faizan", "$MC16", 90, 22, 2019);
		s1.read();
		
		Student s2 = new Student("Lochan", "$MC17", 71, 20, 2019);
		s2.read();
		
		Student s3 = new Student("Amith", "$MC18", 89, 21, 2019);
		s3.read();
		
		Student s4 = new Student("AAAAA", "$MC19", 69, 19, 2019);
		s4.read();
		
		Student s5 = new Student("BBBBB", "$MC20", 59, 21, 2019);
		s5.read();
		
		Student s6 = new Student("CCCCCC", "$MC21", 49, 21, 2019);
		s6.read();
		
		Student s7 = new Student("DDDDDD", "$MC22", 67, 21, 2019);
		s7.read();
		
		Student s8 = new Student("EEEEEE", "$MC23", 99, 21, 2019);
		s8.read();
		
		Student s9 = new Student("FFFFFFF", "$MC24", 99, 21, 2019);
		s9.read();
	}

}
