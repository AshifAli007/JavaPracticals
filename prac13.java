class prac13{
	public static void main(String[] args) {
		
		System.out.println(" = " + add("Summision Is : ",1,2,3,4,5,6,7,8,9,10,111,22,33));
		System.out.println(" = " + add(1,2,3,4.6,5.4));
	}	
	static double add(double ... i){
		double result = 0;
		for(double x : i){
			System.out.print(x + " + ");
			result += x;
		}
		return result;
	}
	static int  add(int ... i){
		int result = 0;
		for(int x : i){
			System.out.print(x + " + ");
			result += x;
		}
		return result;
	}
	static int add(String s,int ... i){
		System.out.print(s);
		int result =0;
		for(int x : i){
			System.out.print(x+ " + ");
			result += x;
		}
		return result;
	}

}