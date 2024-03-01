package EX4;

public class Name
{

    // Create a class Name with three fields of type String: firstName, middleName, and lastName.

    private static String firstName;
    private static String middleName;
    private static String lastName;

    // Create constructors suitable for persons with two names (“Piotr”, “Suski”) and for persons
    // with three names (“Mateusz”, “Pawel”, “Dziurdz”). The field middleName must be set to
    // null, if the person has no middle name

    public Name(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.middleName = null;
        this.lastName = lastName;
    }

    public Name(String firstName, String middleName, String lastName)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    // Add a method getFullName() that returns the person's full name


    public String getFullName()
    {
        if (middleName == null)
        {
            return String.format("%s %s", firstName, lastName);
        } else
        {
            return String.format("%s %s %s", firstName, middleName, lastName);
        }
    }


    // User name is a string created from the name like this:
    // 1. The first 2 letters in the first name in uppercase.
    // 2. The number of letters in the middle name (0 if no middle name).
    // 3. The last 2 letters in the last name in lowercase.
    // The user name of ”Margrethe Mosbæk Dybdahl” is ”MA6hl”.
    // Add a method username() that returns the user name of the person.

    public static String username()
    {
        String a = firstName.substring(0, 2).toUpperCase();

        String b = "";

        if (middleName == null)
        {
            b = "0";
        } else
        {
            b = "" + middleName.length();
        }

        String c = lastName.substring(lastName.length() - 2);

        return a + b + c;
    }

    // Add a method getInits() that returns the initials for a person (the first letter in each of first
    // name, middle name and last name, middle name only if there is a middle name.).

    public static String getInits()
    {

        String a = firstName.substring(0, 1).toUpperCase();

        String b = "";

        if (middleName == null)
        {
            b = "";
        } else
        {
            b = middleName.substring(0, 1).toUpperCase();
        }

        String c = lastName.substring(0, 1).toUpperCase();

        return a + b + c;
    }

    // Add a method getCryptoInits(int count) that returns an encrypted version of the
    // initials. The encryption is done by moving each letter count places in the alphabet, e.g ‘a’
    // encrypted with count = 2 is ‘c’, ‘b’ encrypted with count = 2 is ‘d’ and so on.

    public static String getCryptoInits(int count)
    {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "æ", "ø", "å"};

        String encryptedName = "";

        for (int i = 0; i < firstName.length(); i++)
        {
            String character = firstName.substring(i, i + 1).toLowerCase();

            for (int j = 0; j < alphabet.length; j++)
            {
                if (character.equals(alphabet[j]))
                {
                    encryptedName += alphabet[j + 2];
                }
            }
        }

        return encryptedName.toUpperCase();
    }

    public static void main(String[] args)
    {
        Name person = new Name("Nils", "Hilmar", "Nordby");
        System.out.println(person.getFullName());
        System.out.println(username());
        System.out.println(person.getInits());
        System.out.println(person.getCryptoInits(2));

    }

}


