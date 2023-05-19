package javaDemo.may19;

public class NonPrimitiveDemo {

	public static void main(String[] args) {
		//semester mark
	int mark1 = 50;
	int mark2 = 70;
	int mark3 = 55;
	int mark4 = 90;
	// array
//	type []var-name = new type [size];
	int []marks = new int [4]; //create an array 
	marks[1] = 50;
	marks[0] = 88;
	marks[2] = 90;

System.out.println(marks[2]);//90
//System.out.println(marks[5]); // exception
System.out.println(marks.length);
	}

}
