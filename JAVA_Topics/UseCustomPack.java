import PackOne.Add;
import PackOne.Sub;
import PackTwo.CircleArea;
import PackTwo.TriangleArea;

public class UseCustomPack {
        public static void main(String[] args) {
            Add add = new Add();
            Sub obj = new Sub();

            int sum_1 = add.Sum(10, 20, 30, 40, 50);
            System.out.println("Sum is " + sum_1);

            double sum_2 = add.Sum(40.5, 60.55, 5.111, 10);
            System.out.println("Sum is " + sum_2);

            int sub_1 = obj.sub(50, 20);
            System.out.println("sub is " + sub_1);

            double sub_2 = obj.sub(40.5, 20.55);
            System.out.println("sub is " + sub_2);

            CircleArea circleArea = new CircleArea();
            TriangleArea triangleArea = new TriangleArea();

            System.out.println("Area of circle is : " + circleArea.Area(5));
            System.out.println("Area of triangle is : " + triangleArea.Area(5, 10));
            
        }
}
