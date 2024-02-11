import java.util.Scanner;
class practise {
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter the number1: ");
		double number1 = myInput.nextDouble();
		System.out.print("Enter the number2: ");
		double number2 = myInput.nextDouble();
		System.out.print("Enter the symbol: ");
		char symbol = myInput.next().charAt(0);
		// if(symbol=='+'){
		// 	System.out.println(number1+number2);
		// }
		// else if(symbol=='-'){
		// 	System.out.println(number1-number2);
		// }
		// else{
		// 	System.out.println("Invalid symbol");
		// }
	    switch(symbol){
	    	case'+':
	    	System.out.println(number1+"+"+number2+"="+(number1+number2));
	    	break;
	    	case'-':
	    	System.out.println(number1+"-"+number2+"="+(number1-number2));
	    	case '*':
	    	System.out.println(number1+"*"+number2+"="+(number1*number2));
	    	case '/':
	    	System.out.println(number1+"/"+number2+"="+(number1/number2));
	    }
	}

}