
public class Java4 {
	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) //����,Ȥ�� null�̸� false
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i); 
			//charAt() String Ÿ���� ������(���ڿ�)���� Ư�� ���ڸ� 
			//char Ÿ���̷� ��ȯ�Ҷ� ����ϴ� �Լ�
			//�ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ����� �� ���ھ� ���ʴ�� �о�� charŸ���� ���� ch�� �����Ѵ�.
			
			if(ch<'0' || ch> '9') { //�о�� ����(ch)�� ���ڰ� �ƴϸ� false�� ��ȯ�Ѵ�.
				return false;
			}
		}
		return true; //�־��� ���ڿ��� ��� ���ڷθ� �̷���������� true
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"�� �����Դϱ�? "+isNumber(str));
	}

}
