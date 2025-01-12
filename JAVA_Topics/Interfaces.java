public class Interfaces {
    public static void main(String[] args) {
        System.out.println("Working...");

        Oneplus Model_11R = new Oneplus();
        Model_11R.Flash();
        Model_11R.Camera();
        Model_11R.Speaker();

        SmartWatch Watch_1 = new SmartWatch();

        Watch_1.Flash();
        Watch_1.RAM();
        // So-on;
    }
}

interface Mobile_Functions {
    public void Flash();
    public void Camera();
    public void Speaker();
}

interface HardWare {
    public void Battery();
    public void RAM();
    public void ROM();
    public void Display();
}

class Oneplus implements Mobile_Functions {
    public void Flash(){
        System.out.println("Oneplus got flash");
    }

    public void Camera(){
        System.out.println("Oneplus got Camera");
    }

    public void Speaker(){
        System.out.println("Oneplus got Speakers");
    }
}


class SmartWatch implements Mobile_Functions, HardWare {
    public void Flash(){
        System.out.println("Watch Has flash-light");
    }

    public void Camera(){
        System.out.println("Watch Has Camera");
    }

    public void Speaker(){
        System.out.println("Watch Has Speaker");
    }

    public void Battery(){
        System.out.println("Watch Has Battery");
    }

    public void RAM(){
        System.out.println("Watch Has RAM");
    }

    public void ROM(){
        System.out.println("Watch Has ROM");
    }

    public void Display(){
        System.out.println("Watch Has Display");
    }
}
