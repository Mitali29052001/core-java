import java.util.Scanner;
class UserInput{
	public static void main(String[] args) {
	// Scanner myInput = new Scanner(System.in);
	// System.out.print("Enter First Number: ");
	// int number1 = myInput.nextInt();
	// System.out.print("Enter Second Number: ");
	// int number2 = myInput.nextInt();
	// // number1+=number2;
	// // System.out.println(number1);
	// int answer = number1+number2;
	// System.out.println(number1+"+"+number2+"="+answer);

	//write a java program to understand scanner class and method of scanner class to read data
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter byte: ");
		byte byte1 = myInput.nextByte();
		System.out.print("Enter short: ");
		short short1 = myInput.nextShort();
		System.out.print("Enter int: ");
		int int1 = myInput.nextInt();
		System.out.print("Enter long: ");
		long long1 = myInput.nextLong();
		System.out.print("Enter float: ");
		float float1 = myInput.nextFloat();
		System.out.print("Enter double: ");
		double double1 = myInput.nextDouble();
		System.out.print("Enter character: ");
		char char1 = myInput.next().charAt(0);
		System.out.print("Enter boolean: ");
		boolean boolean1 = myInput.nextBoolean();
		myInput.nextLine();
		System.out.print("Enter string: ");
		String string = myInput.nextLine();
		System.out.println(string);
		// System.out.print("Enter boolean: ");
		// boolean boolean1 = myInput.nextBoolean();
		// System.out.println(string);
		// System.out.print("Enter double: ");
		// double double1 = myInput.nextDouble();
		

	}
}