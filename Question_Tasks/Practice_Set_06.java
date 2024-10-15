/**
 * Practice_Set_06
 */
public class Practice_Set_06 {
    public static void main(String[] args) {
         
        // Q.1: Create an array of 5 floats and calculate their sum.

        float [] arr_1 = {1.2f, 5.3f, 10.6f, 17.2f, 14.32f};
        float sum = 0;

        for(int i = 0; i < arr_1.length; i++){
            sum += arr_1[i];
        }
        
        System.out.printf("Sum is : %.2f", sum);


        System.out.println();


        // Q.2: Write a program to find out whether a given integer is present in an array or not.

        int [] arr_2 = {4, 12, 9, 53, 75, 7, 3};
        int G_int = 52;
        boolean flag = false;

        for(int i = 0; i < arr_2.length; i++){
            if(arr_2[i] == G_int){
                System.out.printf("Yes, Given integer (%d) is present in array.", G_int);
                flag = true;
            }
        }
        if(!flag){
            System.out.printf("No Given Integer (%d) is not in array", G_int);
        }


        System.out.println();



        // Q.3: Calculate the average marks from an array containing marks of all students in physics using a for-each loop.

        int [] marks = {56, 78, 69, 32, 48, 86, 23};
        int size = marks.length;
        int sum_2 = 0;
        
        for (int i : marks) {
            sum_2 += i;
        }

        double avrg = (double)sum_2/size;

        System.out.printf("The average of marks is : %.2f", avrg);



        System.out.println();



        // Q.4: Create a Java program to add two matrices of size 2x3.

        int [][] mat_1 = { {10, 15, 25}, {45, 10, 5} };
        int [][] mat_2 = { {12, 48, 18}, {35, 22, 1} };
    //  int [][] sum_2_mat = { {22, 63, 43}, {80, 32, 6} };
        int [][] sum_2_mat = new int [2][3];

        int num_row = mat_1.length;
        int num_col = mat_1[0].length;

        for(int i = 0; i < num_row; i++){
            for(int j = 0; j < num_col; j++){
                sum_2_mat[i][j] = mat_1[i][j] + mat_2[i][j];
                System.out.printf("Sum of row-%d -- col-%d is : %d \n", i, j, sum_2_mat[i][j]);
            }
        }

        System.out.println();



        // Q.5: Write a Java program to reverse an array?

        int [] arr_nor = {1, 2, 3, 4, 5, 6};
        int [] arr_rev = new int [arr_nor.length];

        for(int i = 0; i < arr_nor.length; i++){
            arr_rev[(arr_nor.length - 1) - i] = arr_nor[i];
        }

        for(int i = 0; i < arr_nor.length; i++){
            System.out.print(arr_rev[i] + " ");
        }


        System.out.println();


        // Q.6: Write a Java program to find the maximum value in a Java array.

        int [] arr_3 = {45, 12, 36, 94, 35, 41};
        int max = arr_3[0];

        for(int i = 0; i < arr_3.length; i++){
            if(max < arr_3[i]){
                max = arr_3[i];
            }
        }

        System.out.println(max);


        System.out.println();



        // Q.7: Write a Java program to find whether an array is sorted or not.

        int [] arr_4 = {6, 5, 4, 3, 2};
        boolean Is_sorted_ascending = true, Is_sorted_descending = true;

        for(int i = 0; i < arr_4.length - 1; i++){
            if(arr_4[i] > arr_4[i + 1]){
                Is_sorted_ascending = false;
            }

            if(arr_4[i] < arr_4[i + 1]){
                Is_sorted_descending = false;
            }
        }

        if (Is_sorted_ascending) {
            System.out.println("Array is sorted in ascending order");
        } else if (Is_sorted_descending) {
            System.out.println("Array is sorted in descending order");
        } else {
            System.out.println("Array is not sorted");
        }

    }
}