/*
 * 
 * @Created by: 21343011 - Nur Chintia Ningsih
 */
//Percobaan 1 pass by value
package JS_09;

public class TestPastByValue {

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		
		test(i);
		System.out.println(i);
		

	}
	
	public static void test (int j) {
		j = 33;
		
	}

}
