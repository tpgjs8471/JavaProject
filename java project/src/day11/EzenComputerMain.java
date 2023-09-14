package day11;

public class EzenComputerMain {

	public static void main(String[] args) {
		
		//EzenComputer의 객체생성 후 출력
		EzenComputer ez=new EzenComputer("일이","1997",27,"12345678","인천");
		ez.printInfo();
		ez.printCompany();
		ez.insertcourse("java","8/16~3/14");
		ez.insertcourse("html","2개월");
		ez.printCourse();
		
		System.out.println("===================");
			
		EzenComputer ez1=new EzenComputer("칠이","1997",27,"7777","서울");
		ez1.printInfo();
		ez1.insertcourse("java", "8/16~3/14");
		ez1.insertcourse("html", "2개월");
		ez1.printCourse();
		
		/* 학생 이름으로 검색 => 모든정보 출력
	       * 지점 정보로 검색 => 학생정보만 출력
	       * 과목을 수강하는 학생만 검색 => 학생정보, 수강정보 출력
	       */
		EzenComputer[]std=new EzenComputer[7];
		std[0]=new EzenComputer("이이","1997",27,"2222","인천");
		std[1]=new EzenComputer("삼이","1997",27,"3333","서울");
		std[2]=new EzenComputer("사이","1997",27,"4444","인천");
		std[3]=new EzenComputer("오이","1997",27,"5555","서울");
		std[4]=new EzenComputer("육이","1997",27,"6666","인천");
		std[5]=ez;
		std[6]=ez1;
		
		System.out.println("========================");
		int cnt=0;
	      String searchName = "11";
	      for(int i=0;i<std.length;i++) {
	    	  if(std[i].getName().equals(searchName)) {
	    		  std[i].printInfo();
	    		  std[i].printCompany();
	    		  std[i].printCourse();
	    		  cnt++;
	    	  }
	      }
	    	  if(cnt==0) {
	    		  System.out.println("검색결과가 없습니다");
	    	  }
	      
//	      for(EzenComputer student:std) {
//	         if(student!=null&&student.getName().equals(searchName)) {  //getname > '이름'만 확인하는 용도
//	            student.printInfo();
//	            student.printCourse();
//	         }
//	      }
	      System.out.println("--------------------");
	      String searchBranch = "인천";
	      System.out.println(searchBranch+"지점의 학생들 목록");
	      //향상된 for문은 완성된 배열에서만 사용 가능  ==> set불가능 / get만가능
	      for(EzenComputer student:std) {
	    	  if(student.getBranch().equals(searchBranch)) {
	    		  student.printInfo();
	    	  }
	      }
	      
//	      for(EzenComputer student:std) {
//	         if(student!=null&&student.getBranch().equals(searchBranch)) {
//	            student.printInfo();
//	         }
//	      }
	      System.out.println("--------------------");
	      String searchCourse="java";
	      System.out.println(searchCourse+"과목의 학생들 목록");
	      for(EzenComputer student : std) {
	    	  for(int i=0;i<student.getCnt();i++) {
	    		  if(searchCourse.equals(student.getCourse()[i])) {
	    			  student.printInfo();
	    			  student.getCourse();
	 
	    		  }
	    	  }
	      }
//	      for(EzenComputer student:std) {
//	         if(student!=null) {
//	            for(int i=0;i<student.getCnt();i++) {
//	               if(student.getCourse()[i].equals(searchCourse)) {
//	                  student.printInfo();
//	                  student.printCourse();
//	               }
//	            }
//	         }
//	      }
	}

}
