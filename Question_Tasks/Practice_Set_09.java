public class Practice_Set_09 {
    public static void main(String[] args) {
        
        Cylinder cylinder = new Cylinder();

        // Q.3: Use a constructor and repeat Q.1:

        System.out.printf("Volume of cylinder by default using costructor : %.2f \n", cylinder.getVolume());


        // Q.1: create a class cylinder and use getter and setters to set its radius and height:

        cylinder.setRadius(5.5f);
        cylinder.setHeight(20.5f);

        System.out.println(cylinder.getRadius() + " & " + cylinder.getHeight());


        // Q.2: calculate surface and volume of the cylinder: 

        System.out.printf("Surface of cylinder : %.2f \n", cylinder.getSurfaceArea());
        System.out.printf("Volume of cylinder : %.2f \n", cylinder.getVolume());
    }
}

//Q.1: 

class Cylinder {
    private float radius;
    private float height;

    public void setRadius(float n){
        radius = n;
    }

    public void setHeight(float n){
        height = n;
    }

    public float getRadius(){
        return this.radius;
    }

    public float getHeight(){
        return this.height;
    }

    // Q.2:

    public float getSurfaceArea(){
        return (2 * 3.14f * this.radius * this.height) + (2 * 3.14f * this.radius * this.radius);
    }

    public float getVolume(){
        return (3.14f * this.radius * this.radius * this.height);
    }

    // Q.3: 

    public Cylinder(){
        this.radius = 5.0f;
        this.height = 5.0f;
    }
}
