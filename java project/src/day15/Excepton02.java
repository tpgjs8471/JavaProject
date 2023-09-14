package day15;

public class Excepton02 {

	public static void main(String[] args) {
		// tyr~catch 문으로 예외처리
		try {

			System.out.println(print(4,0,'+'));
			System.out.println(print(4,0,'-'));
			System.out.println(print(4,0,'*'));
			System.out.println(print(4,0,'/'));
			System.out.println(print(4,0,'%'));
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}

	}
	
	//두 수 연산자를 입력받아 사칙연산을 수행하고 결과를 리턴하는 메서드 생성
	//thorw를 발생시키게 되면 예외를 메서드를 호출하는 객체에게 넘기는 현상
	//thorw를 발생시키게 되면 메서드 선언부 끝에 thorws 발생할 수 있는 예외를 반드시 적어줘야함.
	public static double print(int num1,int num2,char op) throws RuntimeException{
		double result=0; // 리턴값을 담을 변수
		//예외가 발생할 수 있는 상황을 미리 앞에서 처리
		if((op=='/'||op=='%') && num2==0){
			throw new RuntimeException("num2는 0이 될 수 없습니다.");
		}
		switch(op) {
		
		case'+': result=num1+num2; break;
		case'-': result=num1-num2; break;
		case'*': result=num1*num2; break;
		case'/': result=num1/num2; break;
		case'%': result=num1%num2; break;
		default : 
			System.out.println("연산자가 아닙니다"); break;
		}
		return result;
	}
	

}
