public class Practice_Set_10 {
    public static void main(String[] args) {
        System.out.println("Working...");


        /*
         * Q.1: Create a class circle and print area of circle & create a class cylinder and use inheritance to access circle pre declared variables?
         */

        Circle_Area Circle_area = new Circle_Area();
        Circle_area.Set_r(5);
        System.out.println(Circle_area.GetAreaCircle());    // 78.5

        Cylinder_Area Cylinder_area = new Cylinder_Area();
        Cylinder_area.Set_r(5);
        Cylinder_area.Set_h(10);
        System.out.println(Cylinder_area.GetAreaCylinder());    // 471.0

        Cylinder_Area Cylinder_area_2 = new Cylinder_Area();
        Cylinder_area_2.Set_r(10);
        System.out.println(Cylinder_area_2.GetAreaCircle());    // 314.0    
        Cylinder_area_2.Set_h(20);
        System.out.println(Cylinder_area_2.GetAreaCylinder());  // 1884.0

        /*
         * Q.2: Create a class of Rectangle and inhertance class cuboid ? Add methods like area and volume to them ?
         */
        
         Rectangle rectangle = new Rectangle();

         rectangle.SetHeight(10);
         rectangle.SetLength(10);
         rectangle.SetWidth(15);

         System.out.println(rectangle.rect_area()); // 150
         System.out.println(rectangle.rect_vol());  // 1500



         Cuboid cuboid = new Cuboid();

         cuboid.SetHeight(20);
         cuboid.SetLength(20);
         cuboid.SetWidth(25);

         System.out.println(cuboid.Cuboid_area());  // 2800
         System.out.println(cuboid.Cuboid_vol());   // 10000



         Cuboid cuboid_2 = new Cuboid();

         cuboid_2.SetHeight(5);
         cuboid_2.SetLength(10);
         cuboid_2.SetWidth(15);

         System.out.println(cuboid_2.rect_area());  // 150
         System.out.println(cuboid_2.rect_vol());   // 750
         System.out.println(cuboid_2.Cuboid_area());    // 550
         System.out.println(cuboid_2.Cuboid_vol()); // 750
         

    }
}

// Q.1:

class Circle_Area {
    public float PI = 3.14f;
    public float r;

    public void Set_r(float r){
        this.r = r;
    }

    public float GetAreaCircle(){
        return (PI*r*r);
    }
}

class Cylinder_Area extends Circle_Area{
    public float h;

    public void Set_h(float h){
        this.h = h;
    }

    public float GetAreaCylinder(){
        return ((2*PI*r*h) + (2*PI*r*r));
    }
}



// Q.2:

class Rectangle {
    public float length;
    public float width;
    public float height;

    public void SetLength(float n){
        length = n;
    }

    public void SetWidth(float n){
        width = n;
    }

    public void SetHeight(float n){
        height = n;
    }

    public float rect_area(){
        return length*width;
    }

    public float rect_vol(){
        return length * width * height;
    }
}

class Cuboid extends Rectangle {
    public float Cuboid_vol(){
        return rect_vol();
    }

    public float Cuboid_area(){
        return 2 * ((length*width) + (width * height) + (length * height));
    }
}