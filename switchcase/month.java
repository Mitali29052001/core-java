import java.util.Scanner; 
class month{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter the number of month?: ");
		byte monthnum = myInput.nextByte();
		myInput.nextLine();
		switch(monthnum){
			case 2:
			System.out.println("28 days");
			break;
			case 4,6,9,11:
			System.out.println("30 days");
			break;
			case 1,3,5,7,8,10,12:
			System.out.println("31 days");
			break;
			default:
			System.out.println("Invalid Input");
			break;
		}
}
}
