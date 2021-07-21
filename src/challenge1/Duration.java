package challenge1;

public class Duration {
	public static String getDurationString(int minute, int second) {
		int hour=0;
		if(minute>=0 && second>=0 && second<=59) {
			hour = minute/60;
			minute=minute%60;
			return "Hour :"+hour+" "+"Minutes :"+minute+" "+"Seconds :"+second;
			
		}
		else {
			return "Invalid value";
		}
	}
	public static String getDurationString(int seconds) {
		int minutes=0;
		if(seconds>=0) {
			minutes = seconds/60;
			seconds=seconds%60;
			return "Minutes :"+minutes+"Seconds :"+seconds;
		}
		else {
			return "Invalid";
		}
	}
	public static void main(String[] args) {
		System.out.println(getDurationString(150,38));
		System.out.println(getDurationString(100));
	}

}
