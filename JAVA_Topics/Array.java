public class Array {
    public static void main(String[] args) {
        // Arrays is collection of similar type of data: (same data types);
        // Array is object in java.
        // Array is used because it takes only single variable name for all stored data and easy to access with index's;



        // Declaration and memory alloaction:
        int [] nums = new int[5];

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        //nums[5] = 60;      // cause error because size of array is 5 i.e; (0-4);

        System.out.println(nums[3]);

        nums[3] = 100;       // overwrite the previous data;

        System.out.println(nums[3]);



        // First declaration then memory allocation:
        int [] number;
        number = new int[5];

        for(int i = 0; i < 5; i++){
            number[i] = i + 1 * 10;
            System.out.print(number[i] + " ");
        }

        System.out.println();


        // Declaration and memory allocation together:
        int [] mrks = {100, 98, 40, 65, 32};

        for(int i = 0; i < 5; i++){
            System.out.print(mrks[i] + " ");
        }

        System.out.println();


////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

        int [] vol = {2, 5, 8, 4, 12, 6};
        System.out.println("Length of array is : " + vol.length);

        String [] str = {"Stu-01", "Stu-02", "Stu-03", "Stu-04", "Stu-05"};
        System.out.println(str[3]);


        
        int [] marks = {85, 64, 95, 45, 53};
        String [] students = {"Naruto", "Luffy", "Goku", "Ichigo", "dr.Stone"};


        // Displaying using for loop:

        for(int i = 0; i < marks.length; i++){
            System.out.println(students[i] + " got " + marks[i] + " marks ");
        }
        

        // Displaying using for-each loop:

        for(String i: students){
            System.out.println(i);
        }

    }
}
