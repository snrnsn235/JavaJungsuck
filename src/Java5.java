
class MyTv{
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void turnOnOff() {
		//(1)
		isPowerOn = !isPowerOn;
	}
	void volumeUp() {
		//(2)
		if(volume < MAX_VOLUME)
			volume++;
	}
	void volumeDown() {
		//(3)
		if(volume > MIN_VOLUME)
			volume--;
	}
	void channelUp() {
		//(4)
		if(channel==MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
	}
	
	void channelDown() {
		//(5)
		if(channel==MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		} else {
			channel--;
		}		
	}
}

public class Java5 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:"+t.channel+", VOL:" + t.volume);
		//값이 100, 0이 출력
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:" + t.volume);
		//100에서 다운시키면 99, 볼륨은 최소값 보다 클태만 값을 1감소시키므로 그대로 0
		
		t.volume = 100; //채널값이 최대이므로 여기서 up하면 최소값으로 바꿔준다.
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:" + t.volume);
	}

}
