import java.util.Scanner;
class CheckNum {
	public static void main(String[] args) {
	Scanner myInput = new Scanner(System.in);
	System.out.print("Enter a number: ");
	double num = myInput.nextDouble();
	myInput.nextLine();
	if(num>0){
		System.out.println("It is a positive number");
	}
	else if(num<0){
		System.out.println("It is a negative number");
	}
	else {
		System.out.println("It is a Zero");
	}	
  }
}