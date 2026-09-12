 class Student {
	 
	String name;
	int roll_no;
	String phone_no;
	String address;
	
	public static void main(String[] args) {
	
	// part a
	Student student1 = new Student();
	
	student1.roll_no = 2;
	student1.name = "John";
	student1.phone_no = "7845367281";
	student1.address = "Kolhapur";
			
	
	System.out.println("Part (a)");
	System.out.println("Roll no :" + student1.roll_no);
	System.out.println("Name : " + student1.name);
	System.out.println("Phone no : " + student1.phone_no);
	System.out.println("Address : " + student1.address);
	System.out.println();
	
	
	//part b
	
	Student student2 = new Student();
	
	
	student2.roll_no = 3;
	student2.name = "Sam";
	student2.phone_no = "7896452325";
	student2.address = "Mumbai";
	
	System.out.println("Part (b)");
	System.out.println("Roll no :" + student2.roll_no);
	System.out.println("Name : " + student2.name);
	System.out.println("Phone no : " + student2.phone_no);
	System.out.println("Address : " + student2.address);
	
	
	
	
	}
	

}
