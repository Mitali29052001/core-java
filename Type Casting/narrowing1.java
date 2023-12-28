class narrowing1 {
	public static void main(String[] args) {
		double doubleNumber = 67;
		byte byteNumber = (byte) doubleNumber;
		short shortNumber = (short) doubleNumber;
		int intNumber = (int) doubleNumber;
		char character = (char) doubleNumber;
		System.out.println("Double Number:"+ doubleNumber);
		System.out.println("Byte Number:"+ byteNumber);
		System.out.println("Short Number:"+ shortNumber);
		System.out.println("int Number:"+ intNumber);
		System.out.println("Character:"+ character);


	}
}