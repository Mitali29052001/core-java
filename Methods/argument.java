class argument{
	public static void main(String[] args) {
		welcome("Mitali");
		welcome(111);
		welcome(56.8);
		welcome('2');
		welcome("kadam");
	}
	public static void welcome(String name, int number, double number1, char one, String name1) {
		System.out.println("welcome"+name);
		System.out.println("welcome"+number);
		System.out.println("welcome"+number1);
		System.out.println("welcome"+one);
		System.out.println("welcome"+name1);
	}
}