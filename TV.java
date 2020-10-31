package edu.smg;

public class TV {
	public int channel;
	public int volume;
	public boolean on;
	public TV() {
		channel = 1;
		volume = 4;
		on = false;
	}
	public void TurnOn() {
		on = true;
	}
	public void TurnOff() {
		on = false;
	}
	public void setChannel(int newChannel) {
		if(newChannel < 1 || newChannel > 120 || !on)
			return;
		channel = newChannel;
	}
	public void setVolume(int newVolumeLevel) {
		if(newVolumeLevel < 1 || newVolumeLevel > 7 || !on)
			return;
		volume = newVolumeLevel;
	}
	public void ChannelUp() {
		if(channel == 120 || !on)
			return;
		channel++;
	}
	public void ChannelDown() {
		if(channel == 1 || !on)
			return;
		channel--;
	}
	public void VolumeUp() {
		if(volume == 7 || !on)
			return;
		volume++;
	}
	public void VolumeDown() {
		if(volume == 1 || !on)
			return;
		volume--;
	}
}
