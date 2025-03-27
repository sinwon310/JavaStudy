package ex04controlstatement;

public class QuPyramid02 {

	public static void main(String[] args) {
		
		int a=1 ;
		
		
		while(a<=5) {
			int b=1 ;
			do {
				System.out.print("* ");
				b++;
			}while(a+b <= 6);
			System.out.println();
			a++;
		}
	
	}

}
