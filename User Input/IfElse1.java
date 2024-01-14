import java.util.Scanner;
class IfElse1 {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print ("Enter the number: ");
		if(myInput.nextLong()%2==0)
			System.out.println("It is an Even number");
		else
			System.out.println("It is an odd number");
	}
}