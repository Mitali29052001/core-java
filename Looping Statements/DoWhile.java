import java.util.Scanner;
class DoWhile{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter Strat Number");
		int start = myInput.nextInt();
		System.out.print("Enter End Number");
		int end = myInput.nextInt();
		do{
			if(start%2==0){

				System.out.println(start++ + "is a even number");
			}
			else{
				System.out.println(start++ + "is a odd number");
			}
		}
		while(start<=end);
	}
}