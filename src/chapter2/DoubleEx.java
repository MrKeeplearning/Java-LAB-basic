package chapter2;

/*
 * �Ǽ��� �⺻������ double������ �����ϱ� ������,
 * float������ ó���ϰ� �ʹٸ� �Ǽ� ���� �ݵ�� �ĺ���f �Ǵ� F�� �ٿ�����.
 */
public class DoubleEx {

	public static void main(String[] args) {
		
		double dNum = 3.14;
		float fNum = 3.14F;
		
		/*
		 * �ڷ��� ���� ������ ����ϴ� �͵� �����ϴ�(�ڹ�10 ����).
		 * 
		 * ���� ���� �ڷ��� �߷�(local variable type inference):
		 * ������ ���ԵǴ� ���� ���� �����Ϸ��� �߷��Ѵ�.
		 */
		var dNum2 = 3.141592;
		System.out.println(dNum2);
		
	}

}
