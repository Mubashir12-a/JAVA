public class Interfaces {
    public static void main(String[] args) {
        System.out.println("Working...");

        Oneplus Model_11R = new Oneplus();
        Model_11R.Flash();
        Model_11R.Camera();
        Model_11R.Speaker();

        System.out.println("\n");

        SmartWatch Watch_1 = new SmartWatch();
        Watch_1.Flash();
        Watch_1.RAM();
        Watch_1.Camera();
        // So-on;

        System.out.println("\n");

        SmartPhone Redmi_1 = new SmartPhone();
        Redmi_1.Battery();
        Redmi_1.Camera();
        Redmi_1.Display();
        Redmi_1.DoCalls();
        Redmi_1.Flash();
        Redmi_1.OpenGPS();
        Redmi_1.PlayMusic();
        Redmi_1.PlayVideo();
        Redmi_1.RAM();
        Redmi_1.ROM();
        Redmi_1.Speaker();

        // default Method: A method that can be added with implementation concrete method inside interface class 
        //                 without making any errors to implemented child classes it gets aloted to them as defalut like 
        //                 extends and default method can be override by child class.

        Redmi_1.BatteryMah(5000);

        System.out.println("\n");

        BMW car_1 = new BMW();
        car_1.CarModel();
        car_1.AmoledDisplay();
        car_1.Camera();
        car_1.Drive();
        car_1.Flash();
        car_1.Gears();
        car_1.LoudSpeakers();
        car_1.Speaker();
        car_1.Speed();
    }
}

interface Mobile_Functions {
    public int MP = 108;    // Yes we can do that we can declare variable and initialise its value;
    //public int Vol;         // No we can't do that java interfaces don't support feild (empty initialised variable);

    public void Flash();
    public void Camera();
    public void Speaker();
}

interface HardWare {
    public void Battery();
    public void RAM();
    public void ROM();
    public void Display();
    default public void BatteryMah(int n){
        System.out.println("Batter is " + n + "mah");
    }
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
        System.out.println("Watch Has Camera : " + MP);
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


abstract class CellPhone {
    abstract public void DoCalls();
    abstract public void OpenGPS();
    abstract public void PlayMusic();

    public void PlayVideo(){
        System.out.println("Youtube Video");
    }
}


class SmartPhone extends CellPhone implements HardWare, Mobile_Functions {
    public void DoCalls(){
        System.out.println("I Can DO Calls");
    }

    public void OpenGPS(){
        System.out.println("I can open GPS");
    }

    public void PlayMusic(){
        System.out.println("I can Play Music As well");
    }

    //From HardWare :

    public void Battery(){
        System.out.println("I have Battery as well");
    }

    public void Display(){
        System.out.println("I have Display as well");
    }

    public void RAM(){
        System.out.println("I have Ram as well");
    }

    public void ROM(){
        System.out.println("I have Rom as well");
    }

    //From Mobile_Functions :

    public void Flash(){
        System.out.println("I have flash Light as well");
    }

    public void Camera(){
        System.out.println("I have Camera : " + MP);
    }

    public void Speaker(){
        System.out.println("I have speakers as well");
    }
}

interface CarIOT extends Mobile_Functions {
    public void AmoledDisplay();
    public void LoudSpeakers();
}

interface CarFunc extends CarIOT {
    public void Drive();
    public void Speed();
    public void Gears();
}

class BMW implements CarFunc {
    public void CarModel(){
        System.out.println("BMW M-5");
    }

    // CarFunc Methods:

    public void Speed(){
        System.out.println("Car Speed is 150km/h");
    }

    public void Gears(){
        System.out.println("Car Have 8 Gears");
    }

    public void Drive(){
        System.out.println("Car Can Be driven");
    }

    // CarIOT Methods:

    public void LoudSpeakers(){
        System.out.println("Car have loud Speakers");
    }

    public void AmoledDisplay(){
        System.out.println("Car have amoled display");
    }

    // Mobile_func Methods:

    public void Flash(){
        System.out.println("Car Have Flash light");
    }

    public void Camera(){
        System.out.println("Car Have Camera : " + MP + "MGpx");
    }

    public void Speaker(){
        System.out.println("Car Have Mobile Speakers");
    }
}
