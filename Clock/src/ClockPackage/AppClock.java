package ClockPackage;

public class AppClock {

	public static void main(String[] args) {

		Clock motiClock = new Clock(1, 8, 5, 5);

		//test object #1
		motiClock.addHours(4);
		motiClock.addMinutes(1);
		motiClock.addSecound(6);
		motiClock.addmilisecound(7);
     	motiClock.printTime(false);

     	//test object #2
		motiClock.addHours(40);
		motiClock.addMinutes(10);
		motiClock.addSecound(50);
		motiClock.addmilisecound(785);
     	motiClock.printTime(true);

	}
}