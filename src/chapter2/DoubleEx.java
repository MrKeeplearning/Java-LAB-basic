package chapter2;

/*
 * 실수는 기본적으로 double형으로 저장하기 때문에,
 * float형으로 처리하고 싶다면 실수 끝에 반드시 식별자f 또는 F를 붙여주자.
 */
public class DoubleEx {

	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14F;
		
		/*
		 * 자료형 없이 변수를 사용하는 것도 가능하다(자바10 이후).
		 * 
		 * 지역 변수 자료형 추론(local variable type inference):
		 * 변수에 대입되는 값을 보고 컴파일러가 추론한다.
		 */
		var dNum2 = 3.141592;
		System.out.println(dNum2);
		
	}

}
