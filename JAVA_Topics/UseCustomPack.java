import PackOne.Add;

public class UseCustomPack {
        public static void main(String[] args) {
            Add add = new Add();

            int sum_1 = add.Sum(10, 20, 30, 40, 50);
            System.out.println("Sum is " + sum_1);

            double sum_2 = add.Sum(40.5, 60.55, 5.111, 10);
            System.out.println("Sum is " + sum_2);
            
        }
}
