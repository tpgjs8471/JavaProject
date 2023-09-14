package day08;

public class lotto02 {

	public static void main(String[] args) {
		/*
		 * 로또번호 생성 (1~45 랜덤생성)
		 * 로또번호 => 1~45까지 6개 = 사용자번호
		 * 당첨번호 => 1~4까지 7개 => 보너스번호
		 * 
		 * 로또번호 6자리  1 2 3 4 5 6
		 * 당첨번호 6자리+1자리 = 7자리 1 2 3 4 5 6 [7]
		 * 로또번호는 중복되면 안됨.
		 * 로또 등수 확인
		 * 1등 => 6자리 일치
		 * 2등=> 5자리 일치 +보너스번호 일치
		 * 3등 => 5자리 일치
		 * 4등 => 4자리 일치
		 * 5등 => 3자리 일치
		 * 꽝!
		 */
		//배열들 생성
		
		int lotto[]=new int[7];
		int user[]=new int[6];
		
		RandomArray(user);
		RandomArray(lotto);
		PrintArray(user);
		PrintArray(lotto);
		System.out.println("-----------");
		int rank=lottoRank(lotto,user);
		if(rank==-1) {
			System.out.println("꽝");
		}else {
			System.out.println("당첨");
		}

	}

	/*번호를 랜덤으로 생성기능 ( 랜덤번호를 1개만 생성 후 리턴)
	 * 1~45범위의 랜덤 번호를 생성 후 리턴
	 * 
	 */
	public static int random() {
		return(int)(Math.random()*9)+1;
	}
	
	/*2. 1.번호를 배열에 저장하는 기능.
	 * 배열을 완성 => 리턴X
	 * 매게변수= 배열(로또 , 유저)
	 */
	
	public static void RandomArray(int arr[]) {
		//중복상관없이 채우기
		for(int i=0;i<arr.length;i++) {
			arr[i]=random();
		}
		//중복없이 채우기
//		for(int i=0;i<arr.length;i++) {
//			int r=random();
//			for(int j=0;j<=i;j++) {
//			if(arr[i]!=r) { //없다면
//				arr[j]=r;
//			} else {
//				//있다면
//				i--;
//			}
//			}
//		}
	
	
		
		int i=0;
		while(i<arr.length) {
			int r=random();
			if(isContain(arr,r)) {
				arr[i]=r;
				i++;
			}
		}
	}

	
	
	/*3.배열 출력 메서드
	 * 배열을 주고 출력
	 * 
	 */
	public static void PrintArray(int arr[]) {
		if(arr.length==7) {
			for(int i=0;i<arr.length-1;i++) {
				System.out.print(arr[i]+" ");
		}
			System.out.println("["+arr[arr.length-1]+"]");
			System.out.println();
		}
		else {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
		
	}

	
	/*
	 * 4.중복체크 메서드
	 * 중복이면 true , 중복이 아니면 false
	 * 리터타입 : boolean
	 * 매개변수 : int arr[], random값
	 * 메서드명 : isContain
	 */
	public static boolean isContain(int arr[],int random){
		for(int tmp: arr) {
			if(tmp == random) {
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 5. 등수를 체크한느 기능
	 * 리턴타입 : 등수 int => 등수에 해당하지않는 경우는 -1을 리턴
	 * 메개변수 : 로또번호, 유저번호
	 * 메서드명 : lottoRank()
	 * 1등 => 6자리 일치
	* 2등=> 5자리 일치 +보너스번호 일치
	* 3등 => 5자리 일치
	* 4등 => 4자리 일치
	* * 5등 => 3자리 일치
	 */
	public static int lottoRank(int lotto[],int user[]) {
		// lotto배열과 user배열의 개수가 다르므로 순서가 같아야함.
		if(lotto.length<=user.length) {
			return -1;
		}
		int cnt=0; //당첨 개수 카운트
		for(int i=0;i<user.length;i++) {
			if(isContain(user,lotto[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6 : return 1;
		case 5 : 
			if(isContain(user,lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
		case 4: return 4;
		case 3: return 5;
		default : return -1;
		}
	}
}
