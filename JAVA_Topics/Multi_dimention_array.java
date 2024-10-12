/**
 * Multi_dimention_array
 */
public class Multi_dimention_array {
    public static void main(String[] args) {

        // 2-D array:

        int [][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        
        arr[1][0] = 4;          
        arr[1][1] = 5;         
        arr[1][2] = 6;         

        arr[2][0] = 7;         
        arr[2][1] = 8;         
        arr[2][2] = 9;          


        /*
                     _________________________
         *           | col-0 | col-1 | col-2 |
         *           |_______|_______|_______|
         *  row-0    |   1   |   2   |   3   |    
         *           |_______|_______|_______|   
         *  row-1    |   4   |   5   |   6   |
         *           |_______|_______|_______|
         *  row-2    |   7   |   8   |   9   |
         *           |_______|_______|_______|
         */


         for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }


         System.out.println("\n");

         // 3-D array:

         int [][][] arr_2 = new int[2][2][2];
         
         arr_2[0][0][0] = 1;
         arr_2[0][0][1] = 2;

         arr_2[0][1][0] = 3;
         arr_2[0][1][1] = 4;

         arr_2[1][0][0] = 5;
         arr_2[1][0][1] = 6;

         arr_2[1][1][0] = 7;
         arr_2[1][1][1] = 8;

         /*
          *          _________________
          *         /_______/_______/|
          *        /       /       / |
          *       /_______/_______/| |
          *      |       |       | | |    ---> 2-D array layer-0 (front layer) z-axis;
          *      |  1    |   2   | |/|
          *      |_______|_______|/| |
          *      |       |       | |/
          *      |   3   |   4   | /
          *      |_______|_______|/
        */


         /*
          *        _________________
          *       /_______/_______/|
          *      |       |       | |     ---> 2-D array layer-1 (back layer) z-axis;
          *      |  5    |   6   | |
          *      |_______|_______|/|
          *      |       |       | |
          *      |   7   |   8   | /
          *      |_______|_______|/
        */


        for(int i = 0; i < arr_2.length; i++){
            for(int j = 0; j < arr_2.length; j++){
                for(int k = 0; k < arr_2.length; k++){
                    System.out.print(arr_2[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
         }
        


    }
}