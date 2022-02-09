
public class Java4 {
	public static boolean isNumber(String str) {
		if(str==null || str.equals("")) //공백,혹은 null이면 false
			return false;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i); 
			//charAt() String 타입의 데이터(문자열)에서 특정 문자를 
			//char 타입이로 변환할때 사용하는 함수
			//반복문과 charAt(int i)을 이용해서 문자열에서 한 문자씩 차례대로 읽어와 char타입의 변수 ch에 저장한다.
			
			if(ch<'0' || ch> '9') { //읽어온 문자(ch)가 숫자가 아니면 false를 반환한다.
				return false;
			}
		}
		return true; //주어진 문자열이 모두 숫자로만 이루어져있으면 true
	}
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
