class change{
	int a;
	private int b;
	change(){
		a = 0;
		b = 0;
	}
	change(int a,int b){
		this.a = a;
		this.b = b;
	}
	change(change c){
		a = c.a;
		b = c.b;
	}
	void change_var(int a,float b){
		a *= 2;
		b /= 2;
	}
	void change_var(change c){
		c.a *= 2;
		c.b /= 2;
	}
	void show(){
		System.out.print("\nA : " + a + "\nB : " + b);
	}

}
class prac12{
	public static void main(String[] args) {
		int c = 10;
		float d = 2.5f;
		change c1 = new change(5,6);
		change c2 = new change(4,10);
		System.out.print("\nValue Of Public data member A : " + c1.a + " (Public Members of class are accesible outside the class)\n");
		//System.out.print("\nValue Of Public data member A : " + c1.b + " (Public Members of class are accesible outside the class)\n");//error if used
		System.out.print("\nValues of C And D before calling change_var()");
		System.out.print("\nC : " + c + "\nD : " + d);
		c1.change_var(c,d); //here c and d are passed by value
		System.out.print("\n\nValues of C And D After calling change_var()");
		System.out.print("\nC : " + c + "\nD : " + d + " (No Change In The Value Of C and D As They Are Passed By Value )");
		System.out.print("\n\nValues of c2.a And c2.b before calling change_var()");
		c2.show();
		c1.change_var(c2);  //here c2 is passed by reference so changes will appear in original c2
		System.out.print("\n\nValues of c2.a And c2.b before calling change_var()");
		c2.show();
		System.out.print(" (Value Of c2.a = 2*4 and B = 10/2  Because Object C2 Is Passed By Reference)");

	}
}