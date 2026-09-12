 
class Triangle {
	 
	 int side1;
	 int side2;
	 int side3;
	 
	 //constructor
	 
	Triangle(int a, int b, int c){
	
	side1 = a;
	side2 = b;
	side3 = c;
	}
	
	public static void main(String[] args) {
		
		//creating objects
		
		Triangle t = new Triangle(3, 4, 5);
		
		//perimeter
		int perimeter = t.side1 + t.side2 + t.side3;
		
		//semi perimeter
		double s = perimeter / 2.0;
		
		//Area
		double area = Math.sqrt(s *(s - t.side1)*(s - t.side2)*(s - t.side3));
		
		System.out.println("Perimeter of Triangle : " + perimeter);
		System.out.println("Area of the Triangle : " + area);
				
				
		
	}
	
	

}
