class PublicAM{
	public static void main(String[] args) {
		//In java program we can declare n number of class
		//and every class can contain main method
		//if we use public access modifier that contain one method then we can call this method in other class also
		//but if we use private access modifier that contain one method then we cannot call this method in other class because it is private AM.
		//we cannot define main method two times in one class.
		System.out.println("hii from main");
		Method2.TestFrom2();
		Method2.main(new String[0]);

	}

}
class Method2{
	public static void main(String[] args) {
		System.out.println("Hii from method 2");
		PublicAM.main(new String[0]);
	}
	static void TestFrom2(){
		System.out.println("Hii from TestFrom2()");
	}

}