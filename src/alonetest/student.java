package alonetest;

public class student {
	String studentName;
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		
		student studentAhn = new student();
		studentAhn.studentName = "abc";
		System.out.println(studentAhn);
		System.out.println(studentAhn.getStudentName());
	
}
	
}
