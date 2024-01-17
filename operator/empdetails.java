import java.util.Scanner;
class empdetails{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter Your Employee Id: ");
		String id = myInput.nextLine();
		System.out.print("Enter Your Name: ");
		String name = myInput.nextLine();
		System.out.print("Enter Your Mobile Number: ");
		long number = myInput.nextLong();
		myInput.nextLine();
		System.out.print("Enter Your Gender: ");
		char gender = myInput.next().charAt(0);
		System.out.println("Your Employee Id: "+ id);
		System.out.println("Your Name: "+name);
		System.out.println("Your Mobile Number: "+number);
		System.out.println("Your Gender: "+gender);
		



	}
}