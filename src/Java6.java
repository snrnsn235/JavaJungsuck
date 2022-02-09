
public class Java6 {
	public static int max(int [] arr) {
		if(arr==null || arr.length==0)
			return -999999;
		
		int max = arr[0]; //�迭 ù��° ��Ҹ� �ִ밪���� �ʱ�ȭ �Ѵ�.
		
		for(int i=1; i<arr.length; i++) { //length�� 5, ù��° ��Ҵ� �̹� �ִ밪���� �ʱ�ȭ ������ int i = 1
			if(arr[i] >max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data)); //{3,2,9,4,7} �� ���
		System.out.println("�ִ밪: " + max(data)); //�ִ밪 9
		System.out.println("�ִ밪: " + max(null)); //null�̰ų� ���̰� 0�̸� -999999�� ���
		System.out.println("�ִ밪: " + max(new int[] {})); //ũ�Ⱑ 0�� �迭
	}
}
