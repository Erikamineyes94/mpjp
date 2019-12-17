package ex;

public class S58 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value > 0) {
			return "positive";
		} else if (value == 0) {
			return "zero";
		} else {
			return "negative";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		// TODO
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) { // esempio di switch
		switch (value) {
		case 0:
			return "zero";
		case 1:
			return "uno";
		case 2:
			return "due";
		case 3:
			return "tre";
		case 4:
			return "quattro";
		case 5:
			return "cinque";
		case 6:
			return "sei";
		case 7:
			return "sette";
		case 8:
			return "otto";
		case 9:
			return "nove";
		default:
			return "other";
		}
	} //non mettimo il break se metto return ho finito e non posso fare nulla, è un eccezione.

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		if (percentile>90) {
			return 'A';
		
	} else if (percentile>80) {
		return 'B';
	} else if (percentile>70) {
		return 'C';
	} else if (percentile>60) {
		return 'D';
	} else if (percentile>50) {
		return 'E';
	}
	else return 'F';
	
		// TODO
		
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {

		// TODO
		if (year % 400 == 0) {
			return true;
		} else if ((year % 4 == 0) && !(year % 100 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		if ((a < b) && (a < c)) {
			result[0] = a;

		} else if ((b < a) && (b < c)) {
			result[0] = b;

		} else if ((c<a)&& (c<b)) {
			result[0]=c;
		}
		

		// TODO

		return result;
	}
}
