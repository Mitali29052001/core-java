import java.util.Scanner;
class conditionalstatement
{
	public static void main(String[] args) {
		Scanner myInput=new Scanner(System.in);
		System.out.println("Enter Your Number: ");
        double number=myInput.nextDouble();
        if (number>=1)
         {
        	System.out.println("Number is Positive.");
        }
        else if (number<0) {
        	System.out.println("Number is Negative.");
        }
        else{
        	System.out.println("Number is Zero.");
        }
	}
}
