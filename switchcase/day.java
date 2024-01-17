import java.util.Scanner; 
class day{
	public static void main(String[] args) {
		Scanner myInput = new Scanner(System.in);
		System.out.print("What day is it?: ");
		System.out.println("please provide input in lowercase");
		String day = myInput.next();
		switch(day){
			// case "monday":
			// System.out.println("Play Cricket");
			// break;
			// case "tuesday":
			// System.out.println("Play Football");
			// break;
			// case "wednesday":
			// System.out.println("Play volleyball");
			// break;
			// case "thursday":
			// System.out.println("Play kabbadi");
			// break;
			// case "friday":
			// System.out.println("Play kusti");
			// break;
			// case "saturday":
			// System.out.println("Play hockey");
			// break;
			// case "sunday":
			// System.out.println("take holiday");
			// break;
			// default:
			// System.out.println("Invalid Input");
			// break;
			case "monday":
			// System.out.println("Play Cricket");
			case "tuesday":
			// System.out.println("Play Football");
			case "wednesday":
			System.out.println("Play hocky");
			break;
			case "thursday":
			// System.out.println("Play kabbadi");
			case "friday":
			// System.out.println("Play kusti");
			case "saturday":
			System.out.println("Play kusti");
			break;
			case "sunday":
			System.out.println("take holiday");
			break;
			default:
			System.out.println("Invalid Input");
			break;
		}
	}
}