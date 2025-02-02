package PackOne;

public class Sub {
    public int sub(int ...Var){
        int sub = Var[0];
        for (int i = 1; i < Var.length; i++) {
            sub = sub - Var[i];
        }

        return sub;
    }
    
    public double sub(double ...Var){
        double sub = Var[0];
        for (int i = 1; i < Var.length; i++) {
            sub = sub - Var[i];
        }

        return sub;
    }
}
