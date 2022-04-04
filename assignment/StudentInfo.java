package week3.ass.assignment;

public class StudentInfo {

	
	public void getstudentinfo(int id) {
		System.out.println("get stident id :"+" "+id);
		
	}
	
	public void getstudentinfo(String name,int id) {
		System.out.println("get student name :"+ " "+  name);
		System.out.println("get student id :"+ " "+ id);
	}
	
	public void getstudentinfo(long num, String email) {
		System.out.println("get student number :"+ " "+  num);
		System.out.println("get student email id  :"+"  "+   email);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentInfo stu= new StudentInfo();
stu.getstudentinfo(20);

stu.getstudentinfo("dilip", 20);

stu.getstudentinfo(123456789, "dilipdk@gmail.com");
}

}