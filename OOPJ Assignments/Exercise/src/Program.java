
public class Program {
	
	public static void main(String[] args)
	{
	//Scanner sc = new Scanner(System.in);


	    System.out.println("Enter real and imaginary part of first complex number:");
	    double real1 = sc.nextDouble();
	    double imaginary1 = sc.nextDouble();

	    System.out.println("Enter real and imaginary part of second complex number:");
	    double real2 = sc.nextDouble();
	    double imaginary2 = sc.nextDouble();

	    Complex c1 = new Complex(real1, imaginary1);
	    Complex c2 = new Complex(real2, imaginary2);

	    c1.sum(c2);
	    c1.difference(c2);
	    c1.product(c2);

	    sc.close();
	}

}
