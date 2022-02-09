
public class Java6 {
	public static int max(int [] arr) {
		if(arr==null || arr.length==0)
			return -999999;
		
		int max = arr[0]; //배열 첫번째 요소를 최대값으로 초기화 한다.
		
		for(int i=1; i<arr.length; i++) { //length는 5, 첫번째 요소는 이미 최대값으로 초기화 했으니 int i = 1
			if(arr[i] >max)
				max=arr[i];
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(java.util.Arrays.toString(data)); //{3,2,9,4,7} 을 출력
		System.out.println("최대값: " + max(data)); //최대값 9
		System.out.println("최대값: " + max(null)); //null이거나 길이가 0이면 -999999을 출력
		System.out.println("최대값: " + max(new int[] {})); //크기가 0인 배열
	}
}
