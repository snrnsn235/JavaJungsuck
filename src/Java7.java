
public class Java7 {
	
		public static int abs(int value) {
			return value >=0 ? value : -value; 
			//���׿����� 
			//0���� ũ�ų� ������(���) �״�� ��ȯ
			//0���� ũ�ų� ���� ������(����) ��ȣ�� �ٲ㼭 ��ȯ�Գ� �ȴ�.
		}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"�� ���밪: " + abs(value));
		
		value = -10;
		System.out.println(value+"�� ���밪: " + abs(value));
	}

}
