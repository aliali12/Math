import java.util.Objects;

public class Complex {
    private final double real;   
    private final double imaginary;  

    public Complex(double real, double imaginary) {
        re = real;
        im = imaginary;
    }

    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

    public double abs() {
        return Math.hypot(re, im);
    }

    public double phase() {
        return Math.atan2(im, re);
    }

    public Complex plus(Complex b) {
        Complex a = this;             // invoking object
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }

    public Complex minus(Complex b) {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    public Complex times(Complex b) {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }

    public Complex scale(double alpha) {
        return new Complex(alpha * re, alpha * im);
    }

    public Complex conjugate() {
        return new Complex(re, -im);
    }

    public Complex reciprocal() {
        double scale = re*re + im*im;
        return new Complex(re / scale, -im / scale);
    }

    public double re() { return re; }
    public double im() { return im; }

    public Complex divides(Complex b) {
        Complex a = this;
        return a.times(b.reciprocal());
    }

    public Complex exp() {
        return new Complex(Math.exp(re) * Math.cos(im), Math.exp(re) * Math.sin(im));
    }

    public Complex sin() {
        return new Complex(Math.sin(re) * Math.cosh(im), Math.cos(re) * Math.sinh(im));
    }

    public Complex cos() {
        return new Complex(Math.cos(re) * Math.cosh(im), -Math.sin(re) * Math.sinh(im));
    }

    public Complex tan() {
        return sin().divides(cos());
    }
    

    public static Complex plus(Complex a, Complex b) {
        double real = a.re + b.re;
        double imag = a.im + b.im;
        Complex sum = new Complex(real, imag);
        return sum;
    }

    public boolean equals(Object x) {
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Complex that = (Complex) x;
        return (this.re == that.re) && (this.im == that.im);
    }

    public int hashCode() {
        return Objects.hash(re, im);
    }

    public static void main(String[] args) {
        Complex a = new Complex(5.0, 6.0);
        Complex b = new Complex(-3.0, 4.0);

        StdOut.println("a            = " + a);
        StdOut.println("b            = " + b);
        StdOut.println("Re(a)        = " + a.re());
        StdOut.println("Im(a)        = " + a.im());
        StdOut.println("b + a        = " + b.plus(a));
        StdOut.println("a - b        = " + a.minus(b));
        StdOut.println("a * b        = " + a.times(b));
        StdOut.println("b * a        = " + b.times(a));
        StdOut.println("a / b        = " + a.divides(b));
        StdOut.println("(a / b) * b  = " + a.divides(b).times(b));
        StdOut.println("conj(a)      = " + a.conjugate());
        StdOut.println("|a|          = " + a.abs());
        StdOut.println("tan(a)       = " + a.tan());
    }

}