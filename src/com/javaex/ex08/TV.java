package com.javaex.ex08;

public class TV {

		// 필드
		private int channel;
		private int volume;
		private boolean power;

		// 생성자
		public TV() {
			}
		public TV(int channel, int volume, boolean power) {
			this.channel = channel;
			this.volume = volume;
			this.power = power;
		}
		
		// 매소드

		public int getChannel() {
			return channel;
		}

		public int getVolume() {
			return volume;
		}

		public boolean getPower() {                        //왜 is로 바뀌어 있었을까?
			return power;
		}

		// 메소드-일반
		@Override
		public String toString() {
			return "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
		}	
		
		public void power (boolean on) {
			if(on==true) {
				this.power=true;
				System.out.println("TV on");
			} else if (on==false) {
				this.power=false;
				System.out.println("TV off");
			}else {
				this.power = on;
			}
		}
		
		public void channel(int channel) {
			if(channel <=1) {
				this.channel =1;
			} else if (channel >=255) {
				this.channel =255;
			} else {
				this.channel=channel;
			}
		}
		
		//메소드 오버로딩 (0~255 유지 +1,-1)
		public void channel (boolean up) {
			if(up == true) {
				channel(this.channel+1);
			} else {
				channel(this.channel-1);
			}
		}
		
		public void volume(int volume) {
			if(volume<=0) {
				this.volume=0;
			} else if (volume>=255) {
				this.volume = 255;
			} else {
				this.volume=volume;
			}
		}
		
		//메소드 오버로딩 (0~100 유지 +1,-1)
		public void volume(boolean up) {
			if(up==true) {
				volume(this.volume+1);
			} else {
				volume(this.volume-1);
			}
		}
		
		public void status() {
			System.out.println("현재 TV 채널>" + channel);
			System.out.println("현재 TV 볼륨>" + volume);
			System.out.println();
		}
	}
