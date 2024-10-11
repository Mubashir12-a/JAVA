public class Switch_Statement {
    public static void main(String[] args) {

        /*
         switch (expression) {
            case value1:
                    // Code to execute if expression equals value1
                        break; // Exit the switch block

            case value2:
                    // Code to execute if expression equals value2
                        break; // Exit the switch block

            // You can have any number of case statements

            default:
                    // Code to execute if no case matches
            }
         */

        byte num = 10;

        switch (num) {
            case 10:
                System.out.println("Value is 10");
                break;

            case 20:
                System.out.println("Value is 20");
                break;

            case 30:
                System.out.println("Value is 30");
                break;

            default:
                System.out.println("Invalid Value");
                break;
        }         
        


        // New Version of (java-12) switch case where break; statement is not required.

        byte day = 2;

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not Valid Value");
        }
    }
}
