package alonetest;

public class studenttest6 {

	public static void main(String[] args) {
		
		student3 a = new student3();
		student3 b = new student3();
		
		a.id = 1000;
		b.id = 1001;
		a.add();
		b.add();
		System.out.println(a.card);
		System.out.println(b.card);
		

	}

}
