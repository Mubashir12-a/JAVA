public class Interfaces {
    public static void main(String[] args) {
        System.out.println("Working...");

        Oneplus Model_11R = new Oneplus();
        Model_11R.Flash();
        Model_11R.Camera();
        Model_11R.Speaker();
    }
}

interface Mobile_Functions {
    public void Flash();
    public void Camera();
    public void Speaker();
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