package static1;


import static com.greedy.section01.conditional_statement.StaticImpo.print1;

import com.greedy.section01.conditional_statement.StaticImpo;



public class StaticTest {
	public static void main(String[] args) {
		
		
		print1(); //import static com.greedy.section01.conditional_statement.StaticImpo.print1; //메소드만 호출시 + 스태틱 , 메소드명 명시.
		StaticImpo.print1(); //import com.greedy.section01.conditional_statement.StaticImpo;  //클래스명.메소드는 자동생성으로
	}

}
