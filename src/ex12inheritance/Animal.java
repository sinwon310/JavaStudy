package ex12inheritance;
/*
public class Animal {
	
	String species;
	int age;
	char gender;
	
	Animal(String species, int age, char gender){
		this.species = species;
		this.age = age;
		this.gender = gender;
	}
	
	void showAnimal(){
		System.out.println("species= "+ species);
		System.out.println("age= "+ age);
		System.out.println("gender= "+ gender);
	}

}
*/

public class Animal {
	 
	//멤버변수
//	public String species; //종
	private String species; 
	public int age; //나이
	public String gender; //성별
	
	//현재상태 
	public void showAnimal() {
		System.out.println("동물의 종류는:"+ species);
		System.out.println("나이는:"+ age);
		System.out.println("성별은:"+ gender);
	}
	
	//생성자 
	public Animal(String species, int age, String gender) {
		this.species = species;
		this.age = age;
		this.gender = gender;
	}

	
	
	/*
	getter메서드 
		: private으로 선언된 멤버변수를 클래스 외부로 반환할때 
		사용하는 메서드
	 */
	public String getSpecies() {
		return species;
	}
	
}
