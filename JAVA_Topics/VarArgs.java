public class VarArgs {

    // static int sum(int a, int b,  int c, int d){
    //     return a+b+c+d;
    // }

    // VarArgs: (variable arguments)

    static int sum(int pr, int ...more){
        // looks like int [] arr;

        int sum = 0;

        for(int el: more){
            sum += el;
        }

        return sum + pr;
    }


    public static void main(String[] args) {

        System.out.println("Var-Args");

        int permanent = 100;

        System.out.println(sum(permanent, 10, 20, 30, 40, 50));
        System.out.println(sum(15, 25, 35, 45, 55));

    }
}
