/**
 * Precedence
 */

 // Types Of operators:

 /*
  * Arithmetic operators :  ( + ) ( - ) ( * ) ( / ) ( % ) ( ++ ) ( -- );
  * Assignment operators :  ( = ) ( += ) ( -= ) ( *= ) ( /= );
  * Comparison operators :  ( == ) ( <= ) ( >= );
  * Logical    operators :  ( && ) ( || ) ( ! );
  * Bitwise    operators :  ( & ) ( | );   
  */


  // Precedence :

  /*
   * 1. Parentheses: { () }  → No associativity (evaluated first);
   * 2. Multiplicative: { ( * ), ( / ), ( % ) } → Left-to-right;
   * 3. Additive: { ( + ), ( - ) } → Left-to-right;
   * 4. Relational: { ( < ), ( <= ), ( > ), ( >= ) } → Left-to-right;
   * 5. Equality: { ( == ), ( != ) } → Left-to-right;
   * 6. Bitwise AND: { & } → Left-to-right;
   * 7. Bitwise OR: { | } → Left-to-right;
   * 8. Logical AND: { && } → Left-to-right;
   * 9. Logical OR: { || } → Left-to-right;
   * 10. Assignment Operators: { ( = ), ( += ), ( -= ), ( *= ), ( /= ), ( %= ), etc. } → Right-to-left;
   */

public class Precedence {

    public static void main(String[] args) {
        
        System.out.println( (5 * 5) + 20 * 30 / 6 - (5 * 5 - 20));   // 120

        /*
         *  = (5 * 5) + 20 * 30 / 6 - (5 * 5 - 20)  --> Here first parentheses will be solved.
         *  = 25 + 20 * 30 / 6 - 5                  --> Next { ( * ) & ( / )} but according to associativity rule left to right so ( * ) first.
         *  = 25 + 600 / 6 - 5                      --> Next ( / ) will be solved.
         *  = 25 + 100 - 5                          --> Now again { ( + ) ( - ) } but according to associativity rule left to right so ( + ) first.
         *  = 125 - 5                               --> Next ( - ).
         *  = 120                                   --> Done we got answer.
         */

    }
}

