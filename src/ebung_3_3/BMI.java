package ebung_3_3;

public class BMI {

	public static void main(String[] args) {
		
		double weight = 75;
		boolean woman = true;
		double height = 1.65;
		int age = 59;

		double bmi = weight / (height * height);
		System.out.println("BMI = " + bmi);

		if (woman == true) {
			System.out.println("weiblich");
		} else {
			System.out.println("männlich");
		}
		if (woman) {
			bmi = bmi - 1;
		}

		if (age > 64) {
			if (bmi < 25) {
				System.out.println("Untergewichtig");
			} else if (bmi > 30) {
				System.out.println("Übergewichtig");
			} else {
				System.out.println("Normalgewichtig");
			}
		} else if (age > 55) {
			if (bmi < 24) {
				System.out.println("Untergewichtig");
			} else if (bmi > 29) {
				System.out.println("Übergewichtig");
			} else {
				System.out.println("Normalgewichtig");
			}
		} else if (age > 45) {
			if (bmi < 23) {
				System.out.println("Untergewichtig");
			} else if (bmi > 28) {
				System.out.println("Übergewichtig");
			} else {
				System.out.println("Normalgewichtig");
			}
		} else if (age > 35) {
			if (bmi < 22) {
				System.out.println("Untergewichtig");
			} else if (bmi > 27) {
				System.out.println("Übergewichtig");
			} else {
				System.out.println("Normalgewichtig");
			}
		} else if (age > 25) {
			if (bmi < 21) {
				System.out.println("Untergewichtig");
			} else if (bmi > 26) {
				System.out.println("Übergewichtig");
			} else {
				System.out.println("Normalgewichtig");
			}
		} else if (age < 24) {
			if (bmi < 20) {
				System.out.println("Untergewichtig");
			} else if (bmi > 25) {
				System.out.println("Übergewichtig");
			} else {
				System.out.println("Normalgewichtig");
			}
		}
	}
}
