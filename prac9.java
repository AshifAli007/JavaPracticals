class distance1{
	int feet;
	int inches;

	void set_distance(int feet,int inches){
		this.feet = feet;   //this.feet Access class data memeber
		this.inches = inches;
	}
	void show_distance(){
		System.out.print("Distance : "+ feet +" Feet "+inches+" Inches");
	}
}
class pract9{
	public static void main(String[] args) {
		distance d = new distance();	
		d.set_distance(5,6);
		d.show_distance();
		System.out.println("\n\n");
	}
}