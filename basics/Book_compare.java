import java.util.Scanner;

class Book{
	String author;
	String [] chapterNames;//chapter name is a refernce to a string of sie 100
	//String chapterNames[100]
		
	//creating two constructors
	Book(){
		this ("Aftab", new String[]{"Chapter :1", "Chapter :2", "Chapter: 3"});
	}
	
	Book(String author, String chapterNames[] ){
		this. author = author;
		this.chapterNames =  chapterNames;
	}
	
	// method for comparing the author of the two books:
	// it will receive an object
	
	boolean comp_author(Book b2){
			if(this.author.equals(b2. author)){
				return true; 
			}
			else{
				return false;
			}
	}
	
	//comparing the chapter names of the two books and returning the book with the more chapter:
	Book comp_chap(Book b2){
		// comparing the chapter:
		int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < this.chapterNames.length && this.chapterNames[i] != null; i++)
            count1++;

        for(int i = 0; i < b2.chapterNames.length && b2.chapterNames[i] != null; i++)
            count2++;

        if(count1 >= count2)
            return this;
        else
            return b2;
    }
}

class Main{
	public static void main(String[] args){
		Book b1 = new Book();
		
		Book b2;
		
		Book b3;
		
		String [] array = new String[100];
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<=99; i++)
		{
			array[i] = input.nextLine();
			if(array[i].equals("")){
					array[i] = null;
					break;
			}
		}
		
		b2 = new Book("Umer", array);
		// call the compare functions and display the results:
		boolean result = b1.comp_author(b2);
		b3 = b1.comp_chap(b2); // b3 will be storring the refer to the book 2 or book 1
		
		System.out.println("The author of the book with more chapter is: " + b3.author);
	}
}