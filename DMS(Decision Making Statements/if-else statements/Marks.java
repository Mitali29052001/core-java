import java.util.Scanner;
class Marks{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("Enter a marks: ");
		byte marks = myInput.nextByte();
		myInput.nextLine();
		// if(marks<35){
		// 	System.out.println("F");
		// }
		// else if(marks<=60){
		// 	System.out.println("2nd Class");
		// }
		// else if(marks<=75){
		// 	System.out.println("1st  class");
		// }
		// else{
		// 	System.out.println("Distinction");
		// }




		// if(marks>=0 && marks<35){
		// 	System.out.println("F");
		// }
		// else if(marks>=35&&marks<60){
		// 	System.out.println("2nd Class");
		// }
		// else if(marks>=60&&marks<75){
		// 	System.out.println("1st  class");
		// }
		// else{
		// 	System.out.println("Distinction");
		// }





		// if(marks>=0 && marks<35){
		// 	System.out.println("F");
		// }
		// else if(marks>=0 && marks<35){
		// 	System.out.println("F");
		// }
		// else if(marks>=35&&marks<60){
		// 	System.out.println("2nd Class");
		// }
		// else if(marks>=35&&marks<60){
		// 	System.out.println("2nd Class");
		// }
		// else if(marks>=60&&marks<75){
		// 	System.out.println("1st  class");
		// }
		// else{
		// 	System.out.println("Distinction");
		// }


  //       else{
		// 	System.out.println("Distinction");
		// }
		// if(marks<35){
		// 	System.out.println("F");
		// }
		// else if(marks<=60){
		// 	System.out.println("2nd Class");
		// }
		// else if(marks<=75){
		// 	System.out.println("1st  class");
		// }
		

		if(marks<35){
			System.out.println("F");
		}
		else if(marks<=60){
			System.out.println("2nd Class");
		}
		else{
			System.out.println("Distinction");
		}

		else if(marks<=75){
			System.out.println("1st  class");
		}
		
	}
}