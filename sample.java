package pkg_sample;

public class Student {
	
	 int  rollno;
	 String name;
	 int no_subject;
	 float avg_marks;
	 char gender;
	 boolean Nationality;
	 long contact;
	 
	 public void initialize() {
		 rollno=123;
		 name="Alex";
		 no_subject=4;
		 avg_marks=89.78f;
		 gender='M';
		 Nationality=true;
		 contact=1234569872542l;
		 
		 
	 }

	 
	 public void display() {
		 
		 System.out.println("name of the student is:"+name);
		 System.out.println("rollno of the student is:"+rollno);
		 System.out.println("no_subject of the student is:"+no_subject);
		 System.out.println("avg_marks of the student is:"+avg_marks);
		 System.out.println("gender of the student is:"+gender);
		 System.out.println("Nationality of the student is:"+Nationality);
		 System.out.println("contact of the student is:"+contact);
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student objStudent;
		objStudent=new Student();
		objStudent.initialize();
		objStudent.display();
  
	}

}

