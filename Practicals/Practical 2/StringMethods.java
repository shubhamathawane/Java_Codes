// PA:02 : A) String methods 
// Name  : Shubham Athawane
// Roll  : 2262

public class StringMethods {
    public static void main(String[] args) {
        String name = "shubham";
        System.out.println(name);
        // Get string lenght
        int value = name.length();
        System.out.println(value);
        // Get string in lowercase
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        // Get string in Uppercase
        String Ustring = name.toUpperCase();
        System.out.println(Ustring);
        // Non-Trimme string
        String nonTrimmedString = "     Shubham     ";
        System.out.println(nonTrimmedString);
        // Trimmed String
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        // Remove Char from starting of the String
        System.out.println(name.substring(1));
        // Remove cahr between from the string
        System.out.println(name.substring(1, 5));

        //
        System.out.println(name.replace("u", "x"));
        System.out.println(name.replace("x", "hd"));

        // Get String starting with specific character
        System.out.println(name.startsWith("Shu"));
        System.out.println(name.startsWith("ss"));

        // Get character from specific index
        System.out.println(name.charAt(4));

        String modifiString = "Shubhuuaumu";
        System.out.println(modifiString.indexOf("aum"));
        System.out.println(modifiString.indexOf("aum", 4));
        System.out.println(modifiString.lastIndexOf("aum", 4));

        System.out.println(name.equals("Shubham"));
        System.out.println(name.equalsIgnoreCase("shUBhaM"));

        System.out.println("I am escape sequence\tdouble quote ");
    }
}
