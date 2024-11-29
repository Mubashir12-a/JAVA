import java.util.Scanner;

public class Collect_Student_Info {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);  // Import Scanner.
        
        System.out.print(Colors.GREEN+"Enter The Number Of Student : "+Colors.RESET);
        int NumOfStud = scanner.nextInt();      // Get Number of Students for array.

        if(NumOfStud <= 0){
            System.out.println(Colors.RED + "Invalid Number Of Students");
            System.exit(0);
        }
        
        
        int CollectAge[] = new int[NumOfStud];  // Passes the Number Of Student As array length.
        String CollectName[] = new String[NumOfStud];
        String CollectAddress[] = new String[NumOfStud];
        
        
        // Here is loop to get Student data from user as per length.
        for(int i = 0; i < NumOfStud; i++){
            scanner.nextLine();
            
            System.out.print(Colors.CYAN +"Enter Student-" + (i+1) + " Name : ");
            CollectName[i] = scanner.nextLine();
            
            System.out.print(Colors.PURPLE + "Enter Student-" + (i+1) + " Address : ");
            CollectAddress[i] = scanner.nextLine();
            
            System.out.print(Colors.BLUE + "Enter Student-" + (i+1) + " Age : ");
            CollectAge[i] = scanner.nextInt();

            System.out.println();
        }
        
        scanner.close();  // Here Closed Scanner (Input);
        
        Get_Info studentInfo = new Get_Info(NumOfStud);  // Passes The NumberOfStudent as Constructor parameter;

        studentInfo.SetName(CollectName);  // Passes The Names array to function inside another class;
        studentInfo.SetAddress(CollectAddress);  // Passes The Addresses array to function inside another class;
        studentInfo.SetAge(CollectAge);  // Passes The ages array to function inside another class;


        // To Access the data passed by user;

        // studentInfo.GetName(1);
        // studentInfo.GetAddress(1);
        // studentInfo.GetAge(1);

        studentInfo.Get_All_Data();

    }
}

class Student_Info {

    public int NOS;
    public String name[];
    public String address[];
    public int age[];

    Student_Info(int NumberOfStudent){
        NOS = NumberOfStudent;
        name = new String[NOS];
        address = new String[NOS];
        age = new int[NOS];
    } 
}

class Update_Student_Info extends Student_Info{

    Update_Student_Info(int n){
        super(n);
    }

    public void SetName(String ...more){
        for(int i = 0; i < NOS; i++){
            name[i] = more[i];
        }
    }

    public void SetAge(int ...n){
        for(int i = 0; i < NOS; i++){
            age[i] = n[i];
        }
    }

    public void SetAddress(String ...n){
        for(int i = 0; i < NOS; i++){
            address[i] = n[i];
        }
    }
}

class Get_Info extends Update_Student_Info{

    Get_Info(int n){
        super(n);
    }

    public void GetName(int i){
        System.out.println("Student Name is : " + this.name[i]);
    }

    public void GetAge(int i){
        System.out.println("Student Age is : " + this.age[i]);
    }

    public void GetAddress(int i){
        System.out.println("Student Address is : " + this.address[i]);
    }

    public void Get_All_Data(){
        System.out.println(Colors.YELLOW + "NAME" + "\t\t\t\t\t\t\t\t"+ Colors.BLUE + "AGE" + "\t\t\t\t\t\t\t\t"+ Colors.RED + "ADDRESS" + Colors.RESET);

        for(int i = 0; i < name.length; i++){
            System.out.println(Colors.YELLOW + name[i] + "\t\t\t\t\t\t\t\t"+ Colors.BLUE + age[i] + "\t\t\t\t\t\t\t\t"+ Colors.RED + address[i] + Colors.RESET);
        }
    }
}


class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
}