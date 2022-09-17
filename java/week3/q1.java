import java.util.Scanner;

class Complex
{
    float real;
    float imag;

    void assign(float real, float imag)

    {
        this.real=real;
        this.imag=imag;
    }

    void display()
        {
            System.out.println(real+" + "+imag+"i");
        }

    Complex Add(Complex c2)
    {
        Complex cans = new Complex();
        this.real = this.real + c2.real;
        this.imag = this.imag + c2.imag;

        return c2;
    }
   

}









public class q1 {
    public static void main(String[] args) {

        Complex c1 = new Complex();
        c1.assign(23,43);
        c1.display();
        Complex c2 = new Complex();
        c2.assign(44,34);
        c2.display();
        
    }
    
}
