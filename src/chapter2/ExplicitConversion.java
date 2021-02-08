package chapter2;

public class ExplicitConversion {

	/*
	 * 큰 수에서 작은 수로 값을 대입하게 되면 데이터가 유실된다.
	 * 결과적으로 원하는 결과를 얻을 수 없다.
	 */
	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		
		float fNum = 0.9F;
		/*
		 * dNum은 소수점 이하가 사라져 3이 되고, 마찬가지로 fNum은 0이 된다.
		 * 따라서 더한 결과는 3이 된다.
		 */
		int num1 = (int)dNum + (int)fNum;
		/*
		 * 2개의 실수를 더하는데 둘을 더하면 4.04가 된다.
		 * 합한 결과를 int로 형변환하면 4가 된다.
		 */
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
