package day16;

public class 사용자지정Exception {
	public static void main(String[] args) {
		
		/* passwordException
		 * 
		 * 
		 * -비밀번호는 null일수 없다.
		 * -비밀번호의 길이는 5자이상
		 * -비밀번호는 문자로만 이루어지면 안됨 ( 문자+숫자+특수문자)
		 */
		
		String password="abced1%";
		Passwordtest test=new Passwordtest();
		try {
			test.setPassword(password);
			System.out.println(test.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

class Passwordtest {
	private String password;

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if(password==null) {
			throw new PasswordException("비밀번호는 null일수 없습니다");
		}
		else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자리이상이어야 합니다");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자+특수문자를 포함해야 합니다");
		}
		this.password = password;
	}
		
}