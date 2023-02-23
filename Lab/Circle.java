/*Problem Statement 1:  Declaring and using constructors

Create a class Circle.java in a package “com.cognizant.shapes” , add a float instance variable radius and add a default constructor (Constructor 1) for the class.
This constructor should initialize the radius to a default value 1.5f.
The above constructor should be invoked from a main method from another class, Shape.java (in different package com.cognizant. geometry).
Problem Statement 2: Overloading constructors and using “this” keyword.
In the Circle.java class created above add an instance float variable pi and create two overloaded constructors.
Constructor 2- with a float argument name radius. The constructor should initialize the class variable radius  with the method argument radius.
NOTE:   The instance variable and the method argument should be named same as “radius”.
Constructor 3- with two float arguments radius and pi.
Default the class pi value to 3.5 and set the instance variable with the radius method argument.
The constructor “constructor 2” should be invoked from a main method from class, Area.java (in a package com.cognizant.shapes).
Problem Statement 3: Constructor Chaining
In Circle.java, invoke the Constructor 3 created in the previous step from Constructor 2.
Problem Statement 4:  Applying access specifiers to constructors/variables
a. (Other classes must not be able to call this constructor). Also restrict the access to the variable radius to class level
b. Provide package level access to Constructor 2 (Classes in other package must not be able to access this constructor).
   Also provide package level access to the variable pi.
   Problem Statement
5: Create two methods and calculate area and circumference of a Circle
In the Circle.java class, create two methods as listed below
a. Method 1 - calculateCircleArea should accept the float radius as parameter and calculate the area (pi*r*r). 
   It should return the result value to the main method where it should be printed in the console.
b. Method 2 – calculateCircumference should accept float radius as parameter and calculate the circumference (2 * pi * r). 
   It should return the result value to the main method where it should be printed in the console.
   Call these two methods from the main method in Circle.java by passing appropriate parameters.*/



package com.shapes;

public class Circle {      //creating public class circle inside package com.shaepes
	private float radius;  //instantiating private variable radius , data type as float
	public float pi= 3.5f; //initializing public variable pi , data type as float
	
	private Circle() {      //creating private Constructor1 - Circle()
		this.radius = 1.5f; //instance variable radius, value as 1.5f
	}
	
	public Circle(float radius){    //Constructor 2 (parameterized) with one parameter radius
		this.radius = radius;  //initializing class variable radius 
	}
	public Circle(float radius,float pi){  //Constructor 3 (parameterized) with two parameters radius,pi
	    this.pi=pi;                        //initializing instance variable pi 
		this.radius=radius;                //initializing instance variable radius 
	}
	
	public void calculateCircleArea(float radius) {   //method to calculate area of circle
		
		System.out.println("The area of circle is : "+(pi*radius*radius));  //prints the area of circle
	}
	public void calculateCircumference(float radius) {  //method to calculate circumference of circle
		
		System.out.println("The circumference of circle is : "+(2*pi*radius));  //prints the circumference of circle
	}

	public static void main(String[] args) {
		Circle c = new Circle();    //invoking constructor1
		c.calculateCircleArea(1.5f);  //invoking method calculateCircleArea with appropriate parameters
		c.calculateCircumference(1.5f);  //invoking method calculateCircumference with appropriate parameters
		
	}

}
