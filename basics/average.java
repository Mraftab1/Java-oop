/*Create an Encapsulated class Student with following
characteristics:
Data Members:
String Name
Int [] Result_array[5] // Result array contains the marks for 5 subjects
Methods:
Student ( String, int[]) // argument Constructor
Average () // it calculates and returns the average based on the marks in the array.
Runner:
Create two objects of type Student and call the Average method.

25
Compare the Average of both Students and display which student has higher average. Create a
third student with name as object 1 and result array as object 2*/


// in java the array is also a reference type 

//pointer arithemetic is not allowed and the array is passed as a copy of the reference


// in C you are working with the raw memory and in java it is the refernce to an object(safer) (we don't know what the
// reference is actually, it is called an address of the object in the heap but technically it can can be some other 
// because of the jvm garbage collection and it is sometime moving the object accross different mempry address, it is 
// is known to the jvm, so technically it is not exactly the address of the memory always as in the C and we cannot get
// its value   


// when a array is passed to a function then the copy of that reference is passed to that function parameter

class Student{
	private String name;
	private int result_array[] = new int[5];
	
	Student(String name, int arr[]){
		this.name=name;
		for(int i=0; i<result_array.length; i++){
			result_array[i]=arr[i];
		}
	}
	// method for the average;
	
	// array is an object and the class of that is created at the run time by the jvm
	private int average(){
		int total=0;
		for(int i=0; i<result_array.length; i++){
			total += result_array[i];
		}
		return total/result_array.length;
	}
	
	// create two objects of type student:
	public static void main(){
		Student s1=new Student("Aftab", new int[]{50,60,70,80,90});
		Student s2 = new Student("Ali" , new int[]{20,80,50,90,90});// a copy of the refernce is being passed to the parameter
		// we could directly initialize while in the declaration
		
		if(s1.average()>s2.average()){
			System.out.println("The student 1 has the highest average and that is: " + s1.average());
		}
		else{
			System.out.println("The student 2 has the highest average and that is: " + s2.average());
		}
	}
	
}