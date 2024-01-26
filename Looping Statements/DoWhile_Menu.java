import java.util.Scanner;
class DoWhile_Menu{
	public static void main(String[] args) {
	Scanner myInput = new Scanner(System.in);
	boolean flag = true;
	do{
		System.out.println("Menu");
		System.out.println("1. Start");
		System.out.println("2. New");
		System.out.println("3.Exit");
		System.out.println("Enter digit respective to desired option: ");
		byte choice = myInput.nextByte();
		myInput.nextLine();
		if(choice==3){
			flag=false;
		}
	}
	while(flag);	
	}
}