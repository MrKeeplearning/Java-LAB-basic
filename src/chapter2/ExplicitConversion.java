package chapter2;

public class ExplicitConversion {

	/*
	 * ū ������ ���� ���� ���� �����ϰ� �Ǹ� �����Ͱ� ���ǵȴ�.
	 * ��������� ���ϴ� ����� ���� �� ����.
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
		 * dNum�� �Ҽ��� ���ϰ� ����� 3�� �ǰ�, ���������� fNum�� 0�� �ȴ�.
		 * ���� ���� ����� 3�� �ȴ�.
		 */
		int num1 = (int)dNum + (int)fNum;
		/*
		 * 2���� �Ǽ��� ���ϴµ� ���� ���ϸ� 4.04�� �ȴ�.
		 * ���� ����� int�� ����ȯ�ϸ� 4�� �ȴ�.
		 */
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
