import java.lang.Math;

class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int numberToCheckCopy = numberToCheck;
		int calculatedNumber = 0;
		int totalDigits = numberOfDigits(numberToCheck);
		while (numberToCheck != 0) {
			calculatedNumber = calculatedNumber + (int) Math.pow(numberToCheck % 10, totalDigits);
			numberToCheck = numberToCheck / 10;
		}
		if (numberToCheckCopy == calculatedNumber) {
			return true;
		}
		return false;
	}

	int numberOfDigits(int number) {
		int totalDigits = 0;
		while (number != 0) {
			totalDigits++;
			number = number / 10;
		}
		return totalDigits;
	}

}
