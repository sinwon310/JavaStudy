package ex04controlstatement;

public class Qu3Or7Sum {

	public static void main(String[] args) {
/*
문제1) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while, do~while, for문으로 각각 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
 */
		int a = 0;
		int sum = 0;
		while(a<=100) { 
			++a;
			if((a % 3 == 0 || a % 7 == 0) && a % 21 !=0)
			sum += a;
		}
		System.out.println(sum);
		
		int a2 = 3;
		int sum2 = 0;
		do {
			if(a2 % 3 == 0 || a2 % 7 == 0 && a2 % 21 !=0)
			sum2 += a2; a2++;
		}
		while(a2 <= 100);
		System.out.println(sum2);
		
		int a3 = 0;
		int sum3 = 0;
		for(;a3<=100; a3++) {
			if(a3 % 3 == 0 || a3 % 7 == 0 && a3 % 21 !=0)
			sum3 += a3;
		}
		System.out.println(sum3);
		
	}

}
