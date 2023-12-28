class narrowing {
	public static void main(String[] args) {
		//narrowing program without data loss
		// double doubleNumber = 77;
		// int intNumber = (int) doubleNumber;
		// System.out.println("Double Number:"+ doubleNumber);
		// System.out.println("int Number:"+ intNumber);
		//narrowing program with data loss
		// double doubleNumber = 77.77;
		// int intNumber = (int) doubleNumber;
		// System.out.println("Double Number:"+ doubleNumber);
		// System.out.println("int Number:"+ intNumber);
		//int i = 130; byte=?
		int i = 130;
		byte byteNumber = (byte) i;
		System.out.println("i:"+ i);
		System.out.println("Byte Number:"+ byteNumber);


	}
}