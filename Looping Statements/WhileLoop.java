//write java program to print * five time using while loop
// class WhileLoop{
// 	public static void main(String[] args) {
// 		byte repetation = 1;
// 		while(repetation<=5){
// 			System.out.println("*");
// 			repetation++;
// 		}
// 	}
// }



//WJP to print range of number based upon user input
// import java.util.Scanner;
// class WhileLoop{
// 	public static void main(String[] args) {
// 		Scanner myInput = new Scanner(System.in);
// 		System.out.print("Enter the Starting Number");
// 		int start = myInput.nextInt();
// 		System.out.print("Enter the Ending Number");
// 		int end = myInput.nextInt();
// 		myInput.close();//
// 		while(start<=end){
// 			System.out.println(start++);
// 		} 
// 	}
// }



//WAJP to print even number between given range based on given input
import java.util.Scanner;
class WhileLoop{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter Strat Number");
		int start = myInput.nextInt();
		System.out.print("Enter End Number");
		int end = myInput.nextInt();
		while(start<=end){
			if(start%2==0){
				System.out.println(start + "is a even number");
			}
			else{
				System.out.println(start + "is a odd number");
			}
			start++;
		}
	}
}