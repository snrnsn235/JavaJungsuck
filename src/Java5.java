
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
		//���� 100, 0�� ���
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:" + t.volume);
		//100���� �ٿ��Ű�� 99, ������ �ּҰ� ���� Ŭ�¸� ���� 1���ҽ�Ű�Ƿ� �״�� 0
		
		t.volume = 100; //ä�ΰ��� �ִ��̹Ƿ� ���⼭ up�ϸ� �ּҰ����� �ٲ��ش�.
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:" + t.volume);
	}

}
