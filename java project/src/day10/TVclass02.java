package day10;

public class TVclass02 {
	public static void main(String[] args) {
		
		
		
	}
	
}
/*멤버변수 : name power channel vol
 * 메서드 : 전원 채널up/down vol up/down
 */

class TV2{
	
	private String name;
	private boolean power;
	private int channel;
	private int vol;
	
	//생성자
	public TV2() {}
	public TV2(String name) {
		this.name=name;
	}
	
	//메서드
	
	//tv전원
	public void isPower() {
		if(power) {
			power = true;
			System.out.println("tv on");
		} else {
			power=false;
			System.out.println("tv off");
		}
	}
	
	//채널상태
	public void channelUp() {
		if(channel==100) {
			channel=1;
		}else {
		channel++;
	}
	System.out.println("채널: "+channel);
	}
	public void channelDown() {
		if(channel==0) {
			channel=100;
		} else {
		channel--;
		}
		System.out.println("채널: "+channel);
	}
	public void volUp() {
		if(vol==100) {
			vol=100;
			System.out.println("볼륨: "+vol);
		}else {
		vol++;
		System.out.println("볼륨: "+vol);
	}
	}
	public void volDown() {
		if(vol==0) {
			System.out.println("움소거");
		}else {
		vol--;
		System.out.println("볼륨: "+vol);
	}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public void setPower(boolean power) {
		this.power = power;
	}

}