package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {
		
		/*
		 * bNum�� 1byte�̰� num�� 4byte�̴�.
		 * ���� �����ϴ� ���� �ƹ��� ������ ���� �ʴ´�.
		 */
		byte bNum = 10;
		int num = bNum;
		
		System.out.println(num);
		
		/*
		 * ���ͷ�(literal)
		 * : ���α׷����� ����ϴ� ��� ����, ��, �� �� ex) 10, 3.14, 'A', true
		 * 
		 * ���ͷ��� �ش�Ǵ� ���� Ư�� �޸� ������ ��� Ǯ(constant pool)�� ����.
		 * �ʿ��� ��� ��� Ǯ���� �����ͼ� ���.
		 * ��� Ǯ�� ������ �� ������ int, �Ǽ��� double�� ����.
		 * 
		 * ���� long�̳� float ������ �����ؾ� �ϴ� ��� �ĺ���(L, l, F, f)�� ����ؾ� �Ѵ�.
		 * 
		 * 
		 * 10�̶�� ���� ���ͷ��ε� ��� Ǯ�� 4byte�� ����Ǿ� �ִ�.
		 * float fNum = lNum;���� long�� 8byte�̰� float�� 4byte������
		 * float�� �� ������ ���̱� ������ �ڿ������� ����ȯ�� �����ϴ�.
		 */
		long lNum = 10;
		float fNum = lNum;
		
		System.out.println(fNum);
		
		/*
		 * fNum�� float�̰� num�� �������̴�. ���� �������� ���ؼ���
		 * num�� float������ ����ȯ�� �ǰ�, ���� ������ ����� dNum�� ���Եȴ�.
		 * dNum�� �ٽ� double�� ����ȯ�� �̷������.
		 */
		double dNum = fNum + num;
		System.out.println(dNum);
	}

}
