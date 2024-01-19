class conditional{
	public static void main(String[] args) {
		// int n1=1, n2=1;
	// System.out.println(true?"Hi":"Bye");
	// System.out.println(false?"Hi":"Bye");
		// int n1=150, n2=100, n3=13, greaternum;
		// greaternum=((n1<n2)?((n2<n3)?n3:n2):((n1<n3)?n3:n1));
		// System.out.println("Greater Num:"+greaternum);
		int a=2023, b=29, c=28, numberOfDays1;
		boolean numberOfDays=(a%4==0 && a%100!=0);
	    numberOfDays1=numberOfDays?b:c;
		String leapYear=(numberOfDays?"It is a Leap Year":"It is not a Leap Year");
		System.out.println("There is "+ numberOfDays1 +" days in february in " + a + " so " + leapYear);
	}
}