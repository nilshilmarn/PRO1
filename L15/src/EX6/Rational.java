package EX6;

public class Rational
{

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // The method normalize() that returns a new Rational object that has the
    // same decimal value as the this Rational object, but where the numerator
    // is not divisible by the denominator. (Formally, it converts a value p1/q1 to the
    // equivalent value p2/q2 so p2 is not divisible by q2. Hint: you need to find the greatest
    // common divisor of the numerator and denominator fields of the current Rational to implement this.)

    public Rational normalize()
    {

        int p = this.numerator;
        int q = this.denominator;

        int gcd = getGreatestCommonDivisor(p, q);

        return new Rational(p / gcd, q / gcd);
    }

    // Helper method to find the greatest common divisor using Euclid's algorithm
    private int getGreatestCommonDivisor(int a, int b)
    {
        // Ensure a is greater than or equal to b
        if (b == 0)
        {
            return a;
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    // The methods isWhole() and isDecimal() that return true that check
    // whether the rational is a whole number or has decimals, respectively.
    public boolean isWhole()
    {
        double number = (double) this.numerator / this.denominator;

        if (number % 1 == 0)
        {
            return true;
        }
        return false;
    }

    public boolean isDecimal()
    {
        double number = (double) this.numerator / this.denominator;

        if (number % 1 != 0)
        {
            return true;
        }
        return false;
    }

    // The methods equals(int numerator, int denominator) and equals(Rational r)
    // that return true if the numerator and denominator values are equal after normalizing.

    public boolean equals(int numerator, int denominator)
    {
        Rational normalizedRational = this.normalize();
        Rational newRational = new Rational(numerator, denominator).normalize();

        if (normalizedRational.numerator == newRational.numerator && normalizedRational.denominator == newRational.denominator)
        {
            return true;
        }
        return false;
    }

    public boolean equals(Rational r)
    {
        Rational normalizedRational1 = this.normalize();
        Rational normalizedRational2 = r.normalize();

        if (normalizedRational1.numerator == normalizedRational2.numerator && normalizedRational1.denominator == normalizedRational2.denominator)
        {
            return true;
        }
        return false;
    }

    // A static method parseRational(char[], char[]) that converts two arrays of numeric characters to a Rational object

    public static Rational parseRational(char[] a, char[] b)
    {
        int numerator = parseToInt(a);
        int denominator = parseToInt(b);

        return new Rational(numerator, denominator);
    }

    private static int parseToInt(char[] chars)
    {
        int result = 0;
        for (char c : chars)
        {
            result = result * 10 + Integer.parseInt(c + "");
        }
        return result;
    }

    // A static method parseRational(String) that convert a string containing numeric characters separated by ‘/’ to a Rational object.

    public static Rational parseRational(String s)
    {
        String[] array = s.split("/");

        int numerator = Integer.parseInt(array[0]);
        int denominator = Integer.parseInt(array[1]);

        return new Rational(numerator, denominator);

    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }


    public static void main(String[] args)
    {
        Rational rational = new Rational(48, 23);
        System.out.println(rational);
        System.out.println(rational.normalize());


        System.out.println("Is whole? " + rational.isWhole());
        System.out.println("Is decimal? " + rational.isDecimal());

        System.out.println(rational.equals(84, 5));
        System.out.println(rational.equals(rational));

        char[] a = {'1', '2', '3', '4', '5'};
        char[] b = {'1', '2', '3', '4', '5'};

        System.out.println(rational.parseRational(a, b));

        System.out.println(rational.parseRational("123/123"));


    }

    @Override
    public String toString()
    {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}

