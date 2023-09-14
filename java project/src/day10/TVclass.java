package day10;

public class TVclass {

	public static void main(String[] args) {
		
		TV stv=new TV("샘성","2022");
		stv.tvON();
		stv.tvSoundup();
		
		
	}

}

/*
 * TV채널 UP/DOWN (순환)   
 * TV ON/OFF 
 * SOUND UP/DONW (MAX100 , MIN 0)
 */

class TV{
	
	//멤버변수
	private String tvName;
	private String tvYear;
	private boolean tvPower;

	private int tvSound;
	private int tvCh;
	
	
	//생산자
	public TV() {}
	public TV(String tvName,String tvYear) {
		this.tvName=tvName;
		this.tvYear=tvYear;
	}
	
	//메서드
	public void tvON() {
		tvPower=true;
		System.out.println("TV ON");
	}
	public void tvOFF() {
		tvPower=false;
		System.out.println("TV OFF");
	}
	public void tvSoundup() {
		if(tvPower) {
			tvSound=tvSound+50;
			System.out.println("음량: "+tvSound);
			if(tvSound==100) {
				System.out.println("최대음량: "+tvSound);
			}
		}
		else {
			System.out.println("TV를 켜주세요");
	}
	}
	public void tvSoundDown() {
		if(tvSound==0) {
			System.out.println("음소거");
		}
		else {
			tvSound=tvSound-5;
			System.out.println("음량: "+tvSound);
		}
	}
	
	public void tvChup() {
		
		if(tvPower) {
			tvCh=tvCh+1;
			System.out.println("채널: "+tvCh);
		}
		
	}
	
	public void tvChdown() {
		if(tvCh==0) {
			tvCh=10;
			System.out.println("채널: "+tvCh);
		}
		else {
			tvCh=tvCh-1;
			System.out.println("채놀: "+tvCh);
		}
	}
	
	// getter / setter
	public String getTvName() {
		return tvName;
	}
	public void setTvName(String tvName) {
		this.tvName = tvName;
	}
	public String getTvYear() {
		return tvYear;
	}
	public void setTvYear(String tvYear) {
		this.tvYear = tvYear;
	}
}