class distance{
	int feet;
	int inches;

	void set_distance(int feet,int inches){
		this.feet = feet;   //this.feet Access class data memeber
		this.inches = inches;
	}
	void show_distance(){
		System.out.print("\nDistance : "+ feet +" Feet "+inches+" Inches");
	}
	distance(){	//default constructor
		feet = 0;
		inches = 0;
	}
	distance(int feet,int inches){	//parameterised constructor
		this.feet = feet;
		this.inches = inches;
	}
	distance(distance d){	//copy constructor
		this.feet = d.feet;
		this.inches = d.inches;
	}
}
class prac10{
	public static void main(String[] args) {
		distance d = new distance(2,3);	
		distance d1;
		d1 = d;		//d1 is reference to d
		distance d2 = new distance(d); //d2 is clone of d
		d.show_distance();
		d1.show_distance();
		d2.show_distance();
		
	}
}