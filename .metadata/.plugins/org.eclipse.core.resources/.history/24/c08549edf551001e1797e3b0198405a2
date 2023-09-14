package day20;

public class IOStream01 {

	public static void main(String[] args) {
		/* 스트림 : 단방향으로 데이터가 흘러가는 형태
		 * 자바는 입력스트림, 출력스트림을 통해 데이터를 입출력한다.
		 * 다양한 장치에 독립적이고 일관성있는 입출력을 유지하기 위해 입출력 스트림을
		 * 통해 일관성을 제공한다
		  
		 * 두가지 형태의 스트림
		 * -바이트 형태의 스트림 : 기본(문자, 그림, 멀티미디어)
		 * -문자 형태의 스트림 : 믄지민 입출력을 할 때 사용
		 
		 * 바이트 스트림
		 * 	-입력(InputStream) : fileInputSteam, BufferedInputStream, DataInputSteam...
		 * 	-출력(OutputStream) : fileOutputStream, BufferedOutputStream, DataOutputStream, PrintWriter...
		 * 문자 스트림
		 * 	-입력(Reader) : FileReader, BufferdReader, InputSteamReader...
		 * 	-출력(Writer) : FileWriter, PrintWriter, BufferedWriter...
		  
		 * 기반스트림 / 보조스트림
		 * 기반스트림 : 대상에서 직접 자료를 읽고 쓰는 기능이 있는 스트림
		 * 기반스트림 종류 : fileOutputSteam, fileOutputStream, fileReader, fileWriter...
		 
		 * 보조스트림 : 직접 일고 쓰는 기능은 없지만, 추가적인 기능을 더해주는 스트림
		 * 보조스트림 종류 : inputStreamReader, bufferedReader, bufferWriter...
		 */
		
		//표준 출력(모니터=콘솔) 스트림
		System.out.println();
		
		//표준 입력(키보드) 스트림
		try {
			int b = System.in.read(); //한번에 한바이트 읽기	
			System.out.println("read()>"+b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//표준 에러 출력 스트림
		System.err.println("111");
	}

}
