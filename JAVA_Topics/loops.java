public class loops {
    public static void main(String[] args) {
        
        // While loop:
        byte num = 0;

        while(num < 10){
            num++;
            System.out.print(num + " ");
        }


        // do-while loop:
        System.out.println();

        do{
            num++;
            System.out.print(num + " ");
            if(num == 15){
                break;          // stop  when 15 ossurs;
            }
        } while(num < 20);


        // for loop:
        System.out.println();

        for(int i = 1; i <= 10; i++){

            if(i == 5){
                continue;                    // skip 5;
            }

            System.out.print(i + " ");
        }
    }
}
