package edu.smg;

public class TVTest {

	public static void main(String[] args) {
		TV tv1 = new TV();
		System.out.println("channel: " + tv1.channel + ", volume: " + tv1.volume + ", on: " + tv1.on);
		tv1.TurnOn();
		tv1.ChannelUp();
		tv1.VolumeUp();
		System.out.println("channel: " + tv1.channel + ", volume: " + tv1.volume + ", on: " + tv1.on);
		tv1.setChannel(117);
		tv1.setVolume(6);
		System.out.println("channel: " + tv1.channel + ", volume: " + tv1.volume + ", on: " + tv1.on);
	}

}
