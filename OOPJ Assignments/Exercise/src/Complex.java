 //import java.util.Scanner;

class Complex
{
double real;
double imaginary;

Complex(double real, double imaginary)
{
    this.real = real;
    this.imaginary = imaginary;
}

void sum(Complex c)
{
    double realPart = real + c.real;
    double imaginaryPart = imaginary + c.imaginary;

    System.out.println("Sum = " + realPart + " + " + imaginaryPart + "i");
}

void difference(Complex c)
{
    double realPart = real - c.real;
    double imaginaryPart = imaginary - c.imaginary;

    System.out.println("Difference = " + realPart + " + " + imaginaryPart + "i");
}

void product(Complex c)
{
    double realPart = (real * c.real) - (imaginary * c.imaginary);
    double imaginaryPart = (real * c.imaginary) + (imaginary * c.real);

    System.out.println("Product = " + realPart + " + " + imaginaryPart + "i");
}

}


