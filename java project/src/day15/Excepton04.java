package day15;

public class Excepton04 {

	public static void main(String[] args) {
		// 멀티캐치
		/*
		 * try{
		 * 		code..
		 * }catch{하위예외클래스 e){
		 * 
		 * }catch{하위예외클래스 e){
		 * 
		 * }
		 * catch{Exception e){
		 * 
		 * }
		 */

		try {
//			int res=1/0;
//			System.out.println(res);
			int arr[]=null;
//			int arr1[]=new int[3];
//			arr1[5]=13;
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("예외발생1");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("배열범위아웃");
		} catch ( Exception e) {	//마지막은 최상위 exception  => default같은 느낌.
			e.printStackTrace();
		}
		System.out.println("ㅈㅈ");
	}

}
