import java.util.Scanner;
class ForLoop1{
	public static void main(String[] args) {
	Scanner myInput = new Scanner(System.in);
	System.out.print("Enter a start range: ");	
	int start = myInput.nextInt();
	System.out.print("Enter a end range: ");
	int end = myInput.nextInt();
	int oddCount = 0;
	for (int i=start; i<=end; i++) {
		if(i%2!=0){
			System.out.println(i);
			oddCount++;
		}
	}
	System.out.println("Count of odd numbers: "+ oddCount);

	}
}