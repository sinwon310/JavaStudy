package alonetest;

class CarFactory{
	
	private CarFactory() {}
	
	private static CarFactory instance = new CarFactory();

	public static CarFactory getinstance() {
		return instance;
	}
	
}

public class CarFactoryTest {

	public static void main(String[] args) {
		
		

	}

}
