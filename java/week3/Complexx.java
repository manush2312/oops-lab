import java.util.Scanner;

class Complex {
    int real;
    int imag;

    void assign(int r, int i) {
        real=r;
        imag=i;
    }

    void display() {
        System.out.println(real+" + "+imag+"i");
    }

    Complex add(Complex c1) {
        Complex cAns = new Complex();
        cAns.real = c1.real + real;
        cAns.imag = c1.imag + imag;
        return cAns;
    }

    void subtract(Complex c1, Complex c2) {
        if (c2.real > c1.real) {
            real = c2.real - c1.real;
            imag = c2.imag - c1.imag;
        }
        else {
            real = c1.real - c2.real;
            imag = c1.imag - c2.imag;
        }
    }
}

class Complexx 
{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Complex c1 = new Complex();
        Complex c2 = new Complex();
        Complex c3 = new Complex();

        System.out.print("Enter the real part of complex number 1 ");
        int r1 = sc.nextInt();
        System.out.print("Enter the complex part of complex number 1 ");
        int i1 = sc.nextInt();
        System.out.print("Enter the real part of complex number 2 ");
        int r2 = sc.nextInt();
        System.out.print("Enter the complex part of complex number 2 ");
        int i2 = sc.nextInt();
        
        c1.assign(r1,i1);
        c2.assign(r2,i2);

        System.out.println("The first complex number is:");
        c1.display();

        System.out.println("The second complex number is:");
        c2.display();

        c3=c1.add(c2);

        System.out.println("The complex number after addition is:");
        c3.display();

        c3.subtract(c1,c2);

        System.out.println("The complex number after subtraction is:");
        c3.display();
    }
}