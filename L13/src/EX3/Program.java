package EX3;

public class Program
{
    public static void main(String[] arg)
    {
        String ord1 = "Datamatiker";
        String ord2 = "Uddannelsen";


        // a) Udskriv ord1 med store bogstaver.
        System.out.println(ord1.toUpperCase());

        // b) Udskriv ord2 med små bogstaver.
        System.out.println(ord2.toLowerCase());

        // c) Sammensæt ord1 og ord2 med et mellemrum imellem og udskriver resultatet.
        System.out.println(ord1 + " " + ord2);

        // d) Lav en ny variabel ord3, som er en sammensætning af ord1 og ord2, hvor ord2 er med små
        // bogstaver. Udskriv ord3.

        String ord3 = ord1 + " " + ord2.toLowerCase();
        System.out.println(ord3);

        // e) Udskriv længden af strengen fra opgave d).
        System.out.println(ord3.length());

        // f) Udskriv de første 7 bogstaver af ord1.
        System.out.println(ord1.substring(0, 7));

        // g) Udskriv bogstav 3-7 fra ord2.
        System.out.println(ord2.substring(3, 7));

        // h) Udskriv den sidste halvdel af strengen fra opgave d). (Brug ord3.length() metoden.)
        System.out.println(ord3.substring(ord3.length() / 2 + 1));
    }
}
