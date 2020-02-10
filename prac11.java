class prac11{
	public static void main(String[] args) {
		System.out.print("Sum Of Integers 2 and 3 is : " + sum(2,3)); //this will invoke long sum(long a,long b);
		System.out.print("\nSum of Float 5.6 and 9.8 is : " + sum(5.6,9.8)); //this will invoke double sum(double a,double b);

	}
	static long sum(long a,long b){
		//int converted to long automatically by the compiler;
		return a + b;
	}
	static double sum(double a,double b){
		//float converted to double automatically by the compiler;
		return a+b;
	}
}