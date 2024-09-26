
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("Hello World");
        System.out.print("Hello World");

        // println is used because it implements new linne automatically.

        byte num_1 = 100;
        byte num_2 = 50;
        System.out.println(num_1 + num_2);

        short num_3 = 12000;
        short num_4 = 25000;
        System.out.println(num_3 + num_4);

        int num_5 = 1255000;
        int num_6 = 6589000;
        System.out.println(num_5 + num_6);

        long num_7 = 125500500065413131L;
        long num_8 = 658904548778788888L;
        System.out.println(num_7 + num_8);

        char sign = 'M';
        System.out.println(sign);

        float range = 20.65f;
        System.out.println(range);

        double distance = 14.5;
        System.out.println(distance + " Km");

        boolean decision = true;
        System.out.println(decision);

    }
}

/*
 * DATA-TYPES IN JAVA:
 * --> There are two types of data types in java: (Primitive) & (Non-Primitive);
 * |
 * ----> PRIMITIVE DATA-TYPES IN JAVA: 
 * (These are the most basic types of data that you can work with in Java. They represent single values and are built into the language itself.)
 
            from {- (( 2 ^ (data-type_Bytes-Size * 8 )) / 2 )} to {(( 2 ^ (data-type_Bytes-Size * 8 )) / 2 ) - 1 } 

 *  01---> byte:
 *              Size: 1 byte (8 bits)
                Example: Used for small numbers, like age.
                Range: From (-128) to (127). { -(2^1*8)/2 } and { (2^1*8/2) - 1 }

 *  02---> int:
 *              Size: 4 bytes (32 bits)
                Example: Used for everyday numbers, like the number of people.
                Range: From (-2,147,483,648) to (2,147,483,647). { -(2^4*8)/2 } and { (2^4*8/2) - 1 }
    
*  03---> long:
*               Size: 8 bytes (64 bits)
                Example: Used for very large numbers, like population.
                Range: Very large, from (-9,223,372,036,854,775,808) to (9,223,372,036,854,775,807). { -((2^(8*8))/2) } and { ((2^(8*8))/2) - 1 }
                At End of the number there should be ' L ', so java deal it as long number.
                
*  04---> short:
*               Size: 2 bytes (16 bits)
                Example: Used for numbers like small distances.
                Range: From (-32,768) to (32,767). { -(2^2*8)/2 } and { (2^2*8/2) - 1 }
                
*  05---> char:
*               Size: 2 bytes (16 bits)
                Example: Represents a single character, like 'A' or '1'.
                Range: Can store any character.
                
*  06---> float:
*               Size: 4 bytes (32 bits)
                Example: Used for numbers with decimals, like prices.
                Range: Can represent very large and very small decimal numbers.

 *  07---> double:
 *              Size: 8 bytes (64 bits)
                Example: Used for more precise decimal numbers.
                Range: Similar to float but more precise.

 *  08---> bool:
 *              Size: Not precisely defined, but it can hold either true or false.
                Example: Used for yes/no or on/off values.



 * |
 * ----> NON-PRIMITIVE DATA-TYPES IN JAVA:
 * (These are more complex and are built using primitive data types. They can hold multiple values or refer to objects.)
 
 
 *  01- classes:
 *      User-defined data types that can contain variables and methods (functions).
        Example: You can create a class called Car that has properties like color and model.

 *  02- array:
 *      A collection of values of the same type.
        Example: int[] numbers = {1, 2, 3}; (an array of integers)

 *  03- interface:
 *      A way to define methods that a class must implement. It’s like a contract for classes.
        Example: If you have an interface called Animal, any class that implements it must define how that animal makes a sound.

 *  04- string:
 *      A sequence of characters (like a word or sentence).
        Example: "Hello, World!"
 */