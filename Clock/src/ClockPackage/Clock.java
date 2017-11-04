package ClockPackage;

/**
 * class to Add Hours\Minutes\secound
 * 
 *
 */
public class Clock {
	private int HH;
	private int MM;
	private int SS;
	private int SSS;
	private String AMPM;
	private int thisTimeToChange;

	/**
	 * Constructor to create new clock argument: Hours\Minutes\second\milisec
	 * 
	 *
	 */
	public Clock(int HH, int MM, int SS, int SSS) {
		this.HH = HH;
		this.MM = MM;
		this.SS = SS;
		this.SSS = SSS;

	}

	public Clock() {
		this.HH = 14;
		this.MM = 07;
		this.SS = 53;
		this.SSS = 980;

	}

	public void addHours(int HH) {
		if (HH < 0 || HH > 1000000000) {
			return;
		} else {

			this.HH = addTimeGeneral(HH, this.HH, 24);
		}

	}

	public void addMinutes(int MM) {
		if (MM < 0 || MM > 1000000000) {
			return;
		} else {

			this.MM = addTimeGeneral(MM, this.MM, 60);
			addHours((this.MM + MM) / 60);
		}

	}

	public void addSecound(int SS) {
		if (SS < 0 || SS > 1000000000) {
			return;
		} else {
			this.SS = addTimeGeneral(SS, this.SS, 60);
			addMinutes((this.SS + SS) / 60);
		}

	}

	public void addmilisecound(int SSS) {
		if (SSS < 0 || SSS > 1000000000) {
			return;
		} else {
			this.SSS = addTimeGeneral(SSS, this.SSS, 1000);
		}
	}

	private int addTimeGeneral(int timeToAdd, int thisTimeToChange, int divisionIn) {
		if (timeToAdd < 0 || timeToAdd > 1000000000) {
			thisTimeToChange = 0;
			return thisTimeToChange;

		} else {

			int tempTime = thisTimeToChange + timeToAdd;
			thisTimeToChange = (tempTime % divisionIn);
			return thisTimeToChange;

		}

	}

	public void printTime(boolean AMPM) {

		if (AMPM == true) {
			this.AMPM = ":AM/PM";
			if (this.HH > 12) {
				this.HH = this.HH - 12;
			}
		} else {

			this.AMPM = "";
		}
		if (HH < 10) {

			System.out.print("0" + this.HH + ":");
		} else {
			System.out.print(this.HH + ":");
		}

		if (MM < 10) {
			System.out.print("0" + this.MM + ":");
		} else {
			System.out.print(this.MM + ":");
		}
		if (SS < 10) {
			System.out.print("0" + this.SS + ".");
		} else {
			System.out.print(this.SS + ".");
		}
		if (SSS < 10) {
			System.out.println("0" + "0" + this.SSS + " " + this.AMPM);
		} else if (SSS < 100) {
			System.out.println("0" + this.SSS + " " + this.AMPM);
		} else {
			System.out.println(this.SSS + " " + this.AMPM);
		}

	}

}