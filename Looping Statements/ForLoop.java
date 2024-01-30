import java.util.Scanner;
class ForLoop{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter start: ");
		byte start=myInput.nextByte();
		System.out.print("Enter end: ");
		byte end = myInput.nextByte();
		for(byte i=start; i<=end; i++){
			if(i%4==0){
				System.out.println(i);
			}
		}
	}
}