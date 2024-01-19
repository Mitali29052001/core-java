class CompoundAssignment {
	public static void main(String[] args) {
		// int a, b;
		// a=32;
		// b=15;
		// System.out.println(a+=b);
		// System.out.println(a-=b);
		// System.out.println(a*=b);
		// System.out.println(a/=b);
		// System.out.println(a%=b);
		int num1 = 10;
		int num2 = 15;
		System.out.println("num1:" + num1);
		System.out.println("num2:" + num2);
		num1+=num2;
		System.out.println("Addition is :" + num1);
		int num3 = 30;
		int num4 = 15;
		System.out.println("num3:" + num3);
		System.out.println("num4:" + num4);
		num3-=num4;
		System.out.println("Substraction  is :" + num3);
		int num5 = 30;
		int num6 = 15;
		System.out.println("num5:" + num5);
		System.out.println("num6:" + num6);
		num5*=num6;
		System.out.println("Multiplication is:" + num5);
		int num7 = 30;
		int num8 = 15;
		System.out.println("num7:" + num7);
		System.out.println("num8:" + num8);
		num7/=num8;
		System.out.println("Division is:" + num7);
		int num9 = 30;
		int num10 = 15;
		System.out.println("num9:" + num9);
		System.out.println("num10:" + num10);
		num9%=num10;
		System.out.println("Modulus is:" + num9);




	}
}