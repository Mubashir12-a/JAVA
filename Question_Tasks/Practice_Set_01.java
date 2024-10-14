public class Practice_Set_01 {
    public static void main(String[] args) {
        
        // Q.1: Write a java program to convert a string to lowercase?

        String text = "MUBASHIR Ahmad";
        System.out.println(text.toLowerCase());


        // Q.2: Write a java program to replace spaces with underscore?

        String text_2 = "Hello my name is mubashir!";
        System.out.println(text_2.replace(" ", "_"));


        // Q.3: Write a java program to fill in a letter template?

        String template = "Dear <|name|>; Thanks for transaction.";
        String name = "Mubashir";
        String name_2 = "User";

        System.out.println(template.replace("<|name|>", name));
        System.out.println(template.replace("<|name|>", name_2));


        // Q.4: Write a java program to detect double and triple spaces in a string?

        String text_3 = "Here is double  spaces & here is triple   spaces!";
        
        System.out.println("On Index number " + text_3.indexOf("  ") + " double space detected!");
        System.out.println("On Index number " + text_3.indexOf("   ") + " triple space detected!");


        // Q.5: Write a program to format the following letter using escape sequence characters?
        // letter = "Dear User; This Transaction is not valid and failed. thanks for using our services!"

        String letter = "Dear User; \n \tThis Transaction is not valid and \"failed\". \nthanks for using our services!";
        System.out.println(letter);

    }
}
