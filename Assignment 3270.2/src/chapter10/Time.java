package chapter10;

import java.time.LocalTime;

public class Time{
	private int h;
	private int m;
	private int s;
	
	public Time() {
		this.h= LocalTime.now().getHour();
		this.m= LocalTime.now().getMinute();
		this.s= LocalTime.now().getSecond();
	}
	
	public Time(long esecs) {
		this.s = (int) (esecs%60);
		this.m= (int) ((esecs/60)%60);
		this.h= (int) (((esecs/60)/60)%60);
	}
	
	public Time (int h, int m, int s) {
		this.h=h;
		this.m=m;
		this.s=s;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
	
	public void setTime(long esecs) {
		this.s = (int) (esecs%60);
		this.m= (int) ((esecs/60)%60);
		this.h= (int) (((esecs/60)/60)%60);
	}
}
