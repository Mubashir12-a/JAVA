public class StringMethods {
    public static void main(String[] args) {
        // 1) length() : Used to find String Length;

        String name = "Mubashir";
        int size = name.length();

        System.out.println("String is : " + name);
        System.out.println("String Size is: " + size);


        // 2) toLowerCase() : Convert string into lower case charcaters;

        String L_String = name.toLowerCase();
        System.out.println(L_String);


        // 3) toUpperCase() : Convert string into upper case charcaters;
    
        String U_String = name.toUpperCase();
        System.out.println(U_String);


        // 4) Trim() : to remove any leading and trailing whitespace from a string. It does not affect any whitespace between words within the string.

        String str = "    Hello   World      ";
        System.out.println(str);

        str = str.trim();
        System.out.println(str);


        // 5) substring(start, end) : to extract a portion of a string, starting from a specific index and optionally ending at another index.

        System.out.println(name.substring(1));    // ubashir;
        System.out.println(name.substring(1, 3));  // ub;  ---> last character is not included.


        // 6) replace(old, new) :  to replace occurrences of a specified character or substring with another character or substring.

        System.out.println(name.replace('M', 'T'));  // Replace 'M' with 'T';
        System.out.println(name.replace("Mubashir", "World!"));  // Replace "Mubashir" with "World!";


        // 7) startsWith() : to check if a string starts with a specific prefix. It returns true if the string begins with the given prefix and false otherwise.

        System.out.println(name.startsWith("Mub"));  // true
        System.out.println(name.startsWith("Tub"));  // false

        System.out.println(name.startsWith("bashir", 2));  // true

        
        // 8) endsWith() : to check if a string ends with a specific suffix. It returns true if the string ends with the given suffix, and false otherwise.

        System.out.println(name.endsWith("ir"));  // true
        System.out.println(name.endsWith("s"));  // false


        // 9) charAt(index) : to return the character at a specific index in a string. The index is zero-based, meaning the first character is at index 0.

        System.out.println(name.charAt(0)); // M;
        System.out.println(name.charAt(size - 1)); // r;


        // 10) indexOf() : to find the index of the first occurrence of a specified character or substring within a string.
        // --> --> --> --> -->

        System.out.println(name.indexOf('M'));  // 0;
        System.out.println(name.indexOf('r'));  // 7;
        System.out.println(name.indexOf('T'));  // -1; (If the character or substring is not found);

        String Greet = "Hello World!";

        System.out.println(Greet.indexOf("World!"));  // 6;
        System.out.println(Greet.indexOf('l', 1));  // 2;  (starts search from index 1)
        System.out.println(Greet.indexOf('l', 6));  // 9;  (starts search from index 6)


        // 11) lastIndexOf() : to find the index of the last occurrence of a specified character or substring within a string. If the character or substring is not found, it returns -1.
        // <-- <-- <-- <-- <--

        System.out.println(name.lastIndexOf("shir"));  // 4;
        System.out.println(Greet.lastIndexOf('l'));  // 9;


        // 12) equals() : to compare two strings for equality. It returns true if the two strings have the same sequence of characters, and false otherwise. This method is case-sensitive, meaning that "Hello" and "hello" are considered different strings.

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // Comparing two strings
        boolean result1 = str1.equals(str2);  // true
        boolean result2 = str1.equals(str3);  // false (case-sensitive)

        System.out.println(result1);
        System.out.println(result2);


        // 13) equalsIgnoreCase() : It is used to compare two strings for equality, ignoring case differences. This means that "Hello" and "hello" will be considered equal when using this method.

        // Comparing two strings
        boolean result3 = str1.equalsIgnoreCase(str2);  // true
        boolean result4 = str1.equalsIgnoreCase(str3);  // true

        System.out.println(result3);
        System.out.println(result4);

    }
}
