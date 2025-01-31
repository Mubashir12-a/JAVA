package PackOne;

public class Add {

    public int Sum(int ...Var){
        int sum = 0;
        for (int i : Var) {
            sum = sum + i;
        }

        return sum;
    }
    
    public double Sum(double ...Var){
        double sum = 0;
        for (double i : Var) {
            sum = sum + i;
        }

        return sum;
    }
}