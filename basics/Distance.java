/*Create a class ― Distance‖ with two constructors (no argument, and two argument), two data members
( feet and inches) . Create setter, getter and display method. Create a method that adds two Distance
Objects and returns the added Distance Object.*/
class Distance{
	
	private int feet;
	private int inch;
	
	Distance(){
		this (10,10);
	}
	
	Distance(int feet, int inch){
		this.feet = feet;
		this.inch = inch;
	}
	
	//setter
	
	void set_feet(int feet){
		this. feet = feet;
	}
	
	void set_inch(int inch){
		this. inch = inch;
	}
	
	int get_feet(){
		return feet;
	}
	
	int get_inch(){
		return inch;
	}
	
	// creating a method that ads two distance objects and return the added distance object;
	
	Distance add_dis(Distance d1){
			int total_feet = this.feet+d1.feet; 
			int total_inch = this.inch + d1.inch;
			if(inch>=12){
					total_feet += total_inch/12;
					total_inch = total_inch%12;
			}
			return new Distance(total_feet, total_inch);
	}
	
	void display(){
			System.out.println("The feet is: " + feet + "The inches are: " + inch); 
	}
	public static void main(String [] args){
			Distance d1 = new Distance();
			Distance d2 = new Distance(5, 10);
			Distance total = d1.add_dis(d2);
			total.display();
	}
}
