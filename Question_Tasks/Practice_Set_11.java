public class Practice_Set_11 {
    public static void main(String[] args) {
        /*
         * Q.1: Create an abstract class Pen with methods write() and refill() as abstract methods.
         */

        /*
         * Q.2: Use The Pen class From Q.1 to create a concrete class Fountain-Pen with additional method ChangeNib().
         */

         Fountain_Pen Pen_1 = new Fountain_Pen();
         Pen_1.Write();
         Pen_1.Refill();
         Pen_1.ChangeNib();

        /*
         * Q.3: Create a class Monkey with jump() and bite() methods. Create a class Human which
         *      inherits this Monkey class and implements BasicAnimal interfaces with eat() and sleep() methods.
         */
        System.out.println("\n");

        Human human_1 = new Human();
        human_1.Jump();
        human_1.Bite();
        human_1.Eat();
        human_1.Sleep();

        /*
         * Q.4: Create a class TelePhone with Ring(), Lift(), and Disconnect() methods as abstract methods create 
         *      another class Smartphone and demonstrate polymorphism.
         */
        System.out.println("\n");

         TelePhone Phone_1 = new SmartPhone();
         Phone_1.Ring();
         Phone_1.Lift();
         Phone_1.Disconnect();

        /*
         * Q.5: Demostrate Polymorphism using Monkey class from Q.3.
         */
        System.out.println("\n");
        
        Monkey human_2 = new Human();
        human_2.Jump();
        human_2.Bite();
        // human_2.Eat();      /*Creates Error or unaccessable because refrence is Monkey so only Monkey Methods will be used and override*/
        // human_2.Sleep();

        // We need to perform casting here:
        ((Human)human_2).Eat();
        ((Human)human_2).Sleep();

        /*
         * Q.6: Create an interface TV-remote and use it to inherit another interface Smart-TV-remote.
         */
        System.out.println("\n");

        SonyRemote Remote_1 = new SonyRemote();
        Remote_1.MuteKey();
        Remote_1.OnKey();
        Remote_1.OffKey();
        Remote_1.OpenGoogle();
        Remote_1.OpenNetFlix();
        Remote_1.OpenYoutube();

        /*
         * Q.7: Create a class TV which implements TV-Remote interface from Q.6.
         */

        System.out.println("\n");

        TV Panasonic = new TV();
        Panasonic.Display();
        Panasonic.OnKey();
        Panasonic.OffKey();
        Panasonic.MuteKey();

    }
}

//Q.1: 

abstract class Pen {
    abstract public void Write();
    abstract public void Refill();
}

//Q.2:

class Fountain_Pen extends Pen {
    public void Write(){
        System.out.println("Pen Can Write On Paper");
    }

    public void Refill(){
        System.out.println("Pen Is Getting Rifilled");
    }

    public void ChangeNib(){
        System.out.println("Pen Nib Is Changeable");
    }
}

//Q.3:

class Monkey {
    public void Jump(){
        System.out.println("Can Jump");
    }

    public void Bite(){
        System.out.println("Can Bite");
    }
}

interface Animal {
    public void Eat();
    public void Sleep();
}

class Human extends Monkey implements Animal {
    public void Eat(){
        System.out.println("Can Eat");
    }

    public void Sleep(){
        System.out.println("Can Sleep");
    }
}

//Q.4

abstract class TelePhone {
    abstract public void Ring();
    abstract public void Lift();
    abstract public void Disconnect();
}

class SmartPhone extends TelePhone {
    public void Ring(){
        System.out.println("Ringging...");
    }

    public void Lift(){
        System.out.println("Liftting...");
    }

    public void Disconnect(){
        System.out.println("Disconnecting...");
    }
}

//Q.6

interface TVRemote {
    public void OnKey();
    public void OffKey();
    public void MuteKey();
}

interface SmartTVRemote extends TVRemote {
    public void OpenGoogle();
    public void OpenYoutube();
    public void OpenNetFlix();
}

class SonyRemote implements SmartTVRemote {
    public void OnKey(){
        System.out.println("On Key");
    }
    public void OffKey(){
        System.out.println("Off Key");
    }
    public void MuteKey(){
        System.out.println("Mute Key");
    }
    public void OpenGoogle(){
        System.out.println("Open Google");
    }
    public void OpenYoutube(){
        System.out.println("Open Youtube");
    }
    public void OpenNetFlix(){
        System.out.println("open NetFlix");
    }
}

//Q.7:

class TV implements TVRemote {
    @Override
    public void OnKey() {
        System.out.println("On Key");
    }
    @Override
    public void OffKey() {
        System.out.println("Off Key");
    }
    @Override
    public void MuteKey() {
        System.out.println("Mute Key");
    }

    public void Display(){
        System.out.println("4K Display");
    }
}
