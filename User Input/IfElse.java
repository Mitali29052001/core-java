import java.util.Scanner;
class IfElse{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter Your Age: ");
		//if we have only one if or else condition then we can do program without using variable we direct use method instead.
		// if(myInput.nextShort()){
		// 	System.out.println("You are eligible for voting.");
		// }
		// else{
		// System.out.println("You are not eligible for voting.");	
		// }
		//if we have one statement we do programming without using brackets.
		// if(myInput.nextShort())
		// 	System.out.println("You are eligible for voting.");
		// else
		// System.out.println("You are not eligible for voting.");	
		// if we have more than one statements in if or else block then we have to use brackets.
		// if(myInput.nextShort()){
		// 	System.out.println("You are eligible for voting.");
		// System.out.println("You are eligible for voting.");
		// }
		// else{
		// System.out.println("You are not eligible for voting.");	
		// }
		short age = myInput.nextShort();
		if(age>=18){
			System.out.println("You are eligible for voting.");
		}
		else{
		System.out.println("You are not eligible for voting.");	
		}
	}
}