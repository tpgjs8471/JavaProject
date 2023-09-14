package Lotto;

public class LottoManager {
//	// 로또 당첨번호 생성	
//		  public int[] insertLottoAuto() {
//			  int[] lottoNumbers = new int[6];
//		       
//		        for (int i = 0; i < 6; i++) {
//		            int randomNumber;
//		            do {
//		                // 1부터 45 사이의 무작위 번호 생성
//		                randomNumber = (int)(Math.random()*45) + 1;
//		            } while (contains(lottoNumbers, randomNumber)); // 중복 확인
//
//		            lottoNumbers[i] = randomNumber;
//		        }
//		        sort(lottoNumbers);
//		        return lottoNumbers;
//		    }
//		  
	// 로또 번호 생성	  
		  public int[] createLottoAuto() {
		        int[] UserNum = new int[6];
		       
		        for (int i = 0; i < 6; i++) {
		            int randomNumber;
		            do {
		                // 1부터 45 사이의 무작위 번호 생성
		                randomNumber = (int)(Math.random()*45) + 1;
		            } while (contains(UserNum, randomNumber)); // 중복 확인

		            UserNum[i] = randomNumber;
		        }
		        sort(UserNum);
		        return UserNum;
		    }

	
		    
	// 중복되지 않게 확인	  
		public boolean contains(int[] arr, int num) {
	        for (int i : arr) {
	            if (i == num) {
	                return true;  // 중복되면 트루
	            }
	        }
	        return false;
	    }
		
	//로또 배열과 내 배열의 같은 숫자들을 확인
	    public int check(int[] LottoNum, int[] UserNum) {
	        int count = 0;
	        for (int num : UserNum) {
	            if (contains(LottoNum, num)) {
	                count++;
	            }
	        }
	        return count;
	    }
	//등수 확인	
		  public  int prize(int match, boolean bonus) {
		        if (match == 6) {
		            return 1; // 1등
		        } else if (match == 5 && bonus) {
		            return 2; // 2등
		        } else if (match == 5) {
		            return 3; // 3등
		        } else if (match == 4) {
		            return 4; // 4등
		        } else if (match == 3) {
		            return 5; // 5등
		        }
		        return 0; // 꽝
		    }
		  
		 //배열출력
		  public void printAll(LottoE e) {
			  for(int i=0; i<e.index; i++) {
				  System.out.println(i+1+"번째 당첨번호");
				  print(e.l[i].lottoNums);
				  System.out.println("보너스넘버는:"+e.l[i].Bonus);
			  }
			  
		  }
		  public  void print(int[] arr) {
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		 //배열정렬
			public static void sort(int [] arr) {
				for(int i=0;i<arr.length-1;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]>arr[j]) {
							int tmp = arr[i];
							arr[i] = arr[j];
							arr[j] = tmp;
						}
					}
				}
						
				return;
			}
}
