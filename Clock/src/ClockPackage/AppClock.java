package ClockPackage;

public class AppClock {

	public static void main(String[] args) {

		// new default clock
		//Clock defualtClock = new Clock();
		//defualtClock.printTime(false);
		
        //new clock 2
		Clock motiClock = new Clock(00, 00, 0, 000);
		
		motiClock.addHours(1);
		motiClock.printTime(false);
		motiClock.addmilisecound(85);
		motiClock.printTime(false);

		
	}
}