package ClockPackage;

public class Clock {
	private int HH;
	private int MM;
	private int SS;
	private int SSS;
	private String AMPM;

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
			int tempHH = this.HH + HH;
			this.HH = (tempHH % 24);

		}

	}

	public void addMinutes(int MM) {
		if (MM < 0 || MM > 1000000000) {
			return;
		} else {
			int tempMM = this.MM + MM;
			this.MM = (tempMM % 59);
		}

	}

	public void addSecound(int SS) {
		if (SS < 0 || SS > 1000000000) {
			return;
		} else {
			int tempSS = this.SS + SS;
			this.SS = (tempSS % 59);
		}
	}

	public void addmilisecound(int SSS) {
		if (SSS < 0 || SSS > 1000000000) {
			return;
		} else {
			int tempMilisecound = this.SSS + SSS;
			this.SSS = (tempMilisecound % 999);
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
			System.out.print("0" + "0" + this.SSS + " " + this.AMPM);
		} else if (SSS < 100) {
			System.out.println("0" + this.SSS + " " + this.AMPM);
		} else {
			System.out.println(this.SSS + " " + this.AMPM);
		}

	}

}