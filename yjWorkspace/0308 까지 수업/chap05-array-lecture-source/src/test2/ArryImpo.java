package test2;
//배열 다른 패키지 에서 호출
import test.ArrayTest; // import 패키지 . 배열있는클래스

public class ArryImpo {
	public static void main(String[] args) {
		
		ArrayTest arr1 = new ArrayTest();
		
		arr1.hashCode();
		System.out.println(arr1.hashCode());
		
		arr1.anoPaka();
		
		
		
	}
	

}
