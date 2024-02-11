import java.util.Scanner;
class welcomemsg{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = myInput.nextLine();
		printWelcomeMsg(name);
	}
	public static void printWelcomeMsg(String name) {
		System.out.println("Congratulation...!"+name);
	}
}