package L05;

public class ComplexNumber {

    private final double re;

    private final double im;


    public ComplexNumber(double re, double im) {

        this.re = re;
        this.im = im;

    }


    public double getRe() {

        return re;

    }


    public double getIm() {

        return im;

    }


    @Override

    public boolean equals(Object o) {

        if (o != null && o.getClass() == ComplexNumber.class) {
                return Double.compare(this.re, ((ComplexNumber) o).re) == 0 && Double.compare(this.im, ((ComplexNumber) o).im) == 0;
        }
        return false;
    }


    @Override

    public int hashCode() {
        return java.util.Objects.hash(re, im);
    }

}