package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		/*
		 * bNum은 1byte이고 num은 4byte이다.
		 * 따라서 대입하는 것이 아무런 문제가 되지 않는다.
		 */
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		/*
		 * 리터럴(literal)
		 * : 프로그램에서 사용하는 모든 숫자, 값, 논리 값 ex) 10, 3.14, 'A', true
		 * 
		 * 리터럴에 해당되는 값은 특정 메모리 공간인 상수 풀(constant pool)에 있음.
		 * 필요한 경우 상수 풀에서 가져와서 사용.
		 * 상수 풀에 저장할 때 정수는 int, 실수는 double로 저장.
		 * 
		 * 따라서 long이나 float 값으로 저장해야 하는 경우 식별자(L, l, F, f)를 명시해야 한다.
		 * 
		 * 
		 * 10이라는 수는 리터럴인데 상수 풀에 4byte로 저장되어 있다.
		 * float fNum = lNum;에서 long은 8byte이고 float은 4byte이지만
		 * float가 더 정밀한 수이기 때문에 자연스럽게 형변환이 가능하다.
		 */
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		/*
		 * fNum은 float이고 num은 정수형이다. 둘이 더해지기 위해서는
		 * num이 float형으로 형변환이 되고, 둘이 더해진 결과는 dNum에 대입된다.
		 * dNum은 다시 double로 형변환이 이루어진다.
		 */
		double dNum = fNum + num;
		System.out.println(dNum);
	}

}
