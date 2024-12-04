public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
        System.out.println("Working...");

        SmartPhone obj = new Phone();
        obj.Camera();
        obj.Music();
        obj.DoCalls();

        System.out.println("\n\n");

        Components Car_1 = new BMW();
        Car_1.Model("M4");
        Car_1.Engine("V8");
        Car_1.Tiers(4);

        System.out.println("\n");

        Components Car_2 = new Audi();
        Car_2.Model("A8");
        Car_2.Engine("V8");
        Car_2.Tiers(4);
    }
}

class SmartPhone {
    public void Music(){
        System.out.println("Playing Music in SmartPhone");
    }

    public void Camera(){
        System.out.println("Opening Camera In SmartPhone");
    }

    public void DoCalls(){
        System.out.println("Calling From SmartPhone");
    }
}

class Phone extends SmartPhone{
    @Override
    public void DoCalls(){
        System.out.println("Calling From Phone");
    }
}


// Another Example:

class Components {
    public void Tiers(int n){
        System.out.println("override as per requirment");
    }

    public void Engine(String n){
        System.out.println("override as per requirment");
    }

    public void Model(String n){
        System.out.println("override as per requirment");
    }
}


class BMW extends Components {
    @Override
    public void Tiers(int n){
        System.out.println("BMW Car have : " + n + " tiers");
    }

    @Override
    public void Engine(String n){
        System.out.println("BMW Car Engine is : " + n);
    }

    @Override
    public void Model(String n){
        System.out.println("BMW Car Model is : " + n);
    }
}


class Audi extends Components {
    @Override
    public void Tiers(int n){
        System.out.println("Audi Car have : " + n + " tiers");
    }

    @Override
    public void Engine(String n){
        System.out.println("Audi Car Engine is : " + n);
    }

    @Override
    public void Model(String n){
        System.out.println("Audi Car Model is : " + n);
    }
}