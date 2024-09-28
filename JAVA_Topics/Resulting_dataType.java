
/*
 * R = byte + short ---> int
 * R = short + int  ---> int
 * R = long + float ---> float
 * R = int + float  ---> float
 * R = char + int   ---> int
 * R = char + short ---> int
 * R = long + double ---> double
 * R = float + double ---> double
 */


public class Resulting_dataType {
    
    public static void main(String[] args) {
        int ex_1 = 40 + 50; 
        System.out.println(ex_1);
    }

}
