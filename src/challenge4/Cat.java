package challenge4;

public class Cat {
	
	
	public static boolean iscatPlaying(boolean summer, int temperature) {
		if((temperature>25)&&(temperature<35)) {
		
			return true;
		}
		else if((summer)&&(temperature>25)&&(temperature<46)) {
		
			return true;
		}
		else {
			
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(iscatPlaying(false,10));
	}

}
