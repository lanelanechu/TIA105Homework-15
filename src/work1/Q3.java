package work1;

public class Q3 {
	public static void main (String[] args) {
		int time = 256559;
		int second = time % 60;
		time /= 60;
		int minute = time % 60;
		time /= 60;
		int hour = time % 24;
		int day = time / 24;
		System.out.printf("%d天 %d小時 %d分 %d秒", day, hour, minute, second);
	}
}
