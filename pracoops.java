public class pracoops {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, 7);

        Complex sum = Complex.add(c1, c2);
        Complex difference = Complex.diff(c1, c2);
        Complex product = Complex.product(c1, c2);

        System.out.print("Sum: ");
        sum.printComplex();
        
        System.out.print("Difference: ");
        difference.printComplex();
        
        System.out.print("Product: ");
        product.printComplex();
    }
}

class Complex {
    int real;
    int imag;

    public Complex(int r, int i) {
        real = r;
        imag = i;
    }


public static Complex add(Complex a, Complex b) {
    return new Complex((a.real + b.real), (a.imag + b.imag));
}

public static Complex diff(Complex a, Complex b) {
    return new Complex((a.real - b.real), (a.imag - b.imag));
}

public static Complex product(Complex a, Complex b) {
    return new Complex(((a.real * b.real) - (a.imag * b.imag)), ((a.real * b.imag) + (a.imag * b.real)));
}

public void printComplex() {
    if (real == 0 && imag != 0) {
        System.out.println(imag + "i");
    } else if (imag == 0 && real != 0) {
        System.out.println(real);
    } else {
        System.out.println(real + "+" + imag + "i");
    }
}
}

