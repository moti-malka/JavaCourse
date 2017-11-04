package ClockPackage;

public class AppClock {

	public static void main(String[] args) {

		// new default clock
		//Clock defualtClock = new Clock();
		//defualtClock.printTime(false);
		
        //new clock 2
		Clock motiClock = new Clock(00, 00, 0, 000);
		motiClock.addMinutes(720);
		motiClock.printTime(false);
		
		
	}
}