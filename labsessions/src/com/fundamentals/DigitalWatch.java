package com.fundamentals;

public class DigitalWatch {
	String brandName;
	String watchType;
	String personName;
	byte hours;
	byte minutes;
	byte seconds;
	double price;

	void displayTime() {
		System.out.println("================ Time ===========================");
		System.out.println("This method shows time of : " + personName + "'s watch !");
		System.out.println("Time : " + hours + ":" + minutes + ":" + seconds);
		System.out.println("=================================================");
	}

	void displayWatchDeatils() {
		System.out.println("=============== Watch Details ============================");
		System.out.println("WatchBrand : " + brandName);
		System.out.println("Watch Type : " + watchType);
		System.out.println("This watch belongs to : " + personName);
		System.out.println("Time : " + hours + ":" + minutes + ":" + seconds);
		System.out.println("==========================================================");
	}

	void updateHour() {
		System.out.println("================ Update Hour ============================");
		System.out.println("Before Update -> Time : " + hours + ":" + minutes + ":" + seconds);
		hours += 1;
		System.out.println("After Update -> Time : " + hours + ":" + minutes + ":" + seconds);
		System.out.println("=========================================================");
	}

	void updateMintues() {
		System.out.println("============== Update Minutes =============================");
		System.out.println("Before Update -> Time : " + hours + ":" + minutes + ":" + seconds);
		minutes += 5;
		System.out.println("After Update -> Time : " + hours + ":" + minutes + ":" + seconds);
		System.out.println("============================================================");
	}

	public static void main(String[] args) {
		DigitalWatch watch1 = new DigitalWatch();
		watch1.brandName = "Titan";
		watch1.watchType = "Analog Watch";
		watch1.personName = "Manohar";
		watch1.hours = 9;
		watch1.minutes = 36;
		watch1.seconds = 55;

		watch1.displayWatchDeatils();
		watch1.displayTime();
		watch1.updateHour();
		watch1.updateMintues();

	}

}
