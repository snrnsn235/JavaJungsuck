
public class Java7 {
	
		public static int abs(int value) {
			return value >=0 ? value : -value; 
			//삼항연산자 
			//0보다 크거나 같으면(양수) 그대로 반환
			//0보다 크거나 같지 않으면(음수) 부호를 바꿔서 반환함녀 된다.
		}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값: " + abs(value));
		
		value = -10;
		System.out.println(value+"의 절대값: " + abs(value));
	}

}
