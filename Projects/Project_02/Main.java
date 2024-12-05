import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Add_Account_Holder add_Account_Holder = new Add_Account_Holder();
        File_Handling file_Handling = new File_Handling();

        // file_Handling.Erase_All_Data();

        // add_Account_Holder.Take_No_Of_Entries(scanner);
        // Data [] data = new Data[Data.Entries];

        // file_Handling.ReadLast_Ac_No();
        // //System.out.println(Data.base_Ac_no);
        // file_Handling.Read_Serial_Number();
        // //System.out.println(Data.Serial_No);
            
        // add_Account_Holder.Take_Input(data, scanner, file_Handling);
        // file_Handling.Write_On_File(data);

        // file_Handling.Get_Total_Amount_InBAnk();


        
        scanner.close();
    }
}

class Data {
    public static int Entries;
    
    public static long Ac_number = 11202400005001l;
    public static long base_Ac_no = Ac_number;

    public String Name;
    public long Contact;
    public long Balance;

    public static int Serial_No;

    public static long Total_Balance = 0;

    public static boolean Over_ride = true;
    public static String File_Name = "Info.txt";
}


class Add_Account_Holder {
    public void Take_No_Of_Entries(Scanner scanner){
        System.out.print(Colors.P + "Enter No.Of Enteries : " + Colors.W);
        Data.Entries = scanner.nextInt();
    }

    public void Take_Input(Data[] D, Scanner scanner, File_Handling file_Handling){
        for (int i = 0; i < Data.Entries; i++) {
            D[i] = new Data();

            scanner.nextLine();

            System.out.print(Colors.B + "Enter Holder-" + (Data.Serial_No + (i + 1)) + " Name : " + Colors.W);
            D[i].Name = scanner.nextLine();

            System.out.printf(Colors.B + "Enter " + Colors.Y + D[i].Name + Colors.B + " Contact Number : " + Colors.W);
            D[i].Contact = scanner.nextLong();

            System.out.println(Colors.B + "Alotted Account Number Is : " + Colors.Y + (Data.base_Ac_no + i) + Colors.W);

            System.out.print(Colors.B + "Enter Opening Balance of A/c " + Colors.Y + (Data.base_Ac_no + i) + Colors.B + " : " + Colors.W);
            D[i].Balance = scanner.nextLong();

            System.out.println("\n");
        }
    }
}



class File_Handling {
    public void Write_On_File(Data[] D){
        for (int i = 0; i < Data.Entries; i++) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(Data.File_Name, Data.Over_ride))) {

                writer.write("Holder-" + (Data.Serial_No + (i + 1)) + "--------\n");

                writer.write("Account Number is : " + String.valueOf((Data.base_Ac_no + i)) + "\n");
                writer.write("Name is " + D[i].Name + "\n");
                writer.write("Contact is : " + String.valueOf(D[i].Contact) + "\n");
                writer.write("Balance is : " + String.valueOf(D[i].Balance));

                writer.newLine();
                writer.newLine();
                writer.newLine();

                System.out.println(Colors.G + "Successfully Done" + Colors.W);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void ReadLast_Ac_No(){
        String Line;
        String Account_Num_Part = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(Data.File_Name))){
            while((Line = reader.readLine()) != null){
                if(Line.startsWith("Account Number is :")){
                    Account_Num_Part = Line;
                }
            }

            if(Account_Num_Part != null){
                String[] parts = Account_Num_Part.split(":");
                Data.base_Ac_no = Long.parseLong(parts[1].trim());
                Data.base_Ac_no++;
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void Read_Serial_Number(){
        String Line;
        String Serial_Num_part = null;

        try(BufferedReader reader = new BufferedReader(new FileReader(Data.File_Name))){
            while((Line = reader.readLine()) != null){
                if(Line.startsWith("Holder-")){
                    Serial_Num_part = Line;
                }

                if(Serial_Num_part != null){
                    String [] parts = Serial_Num_part.split("-");
                    Data.Serial_No = Integer.parseInt(parts[1].trim());
                }
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void Erase_All_Data(){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(Data.File_Name, false))){
            writer.write("");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void Get_Total_Amount_InBAnk(){
        String Line;
        String Get_Amount_From_File = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(Data.File_Name))){
            while((Line = reader.readLine()) != null){
                if(Line.startsWith("Balance is : ")){
                    Get_Amount_From_File = Line;

                    if(Get_Amount_From_File != null){
                        String [] parts = Get_Amount_From_File.split(":");
                        Data.Total_Balance += Long.parseLong(parts[1].trim());
                    }
                }

            }

        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println(Colors.G + "Total Amount In Bank Is : " + Data.Total_Balance + Colors.W);

    }
}


class Colors {
    public static final String RESET = "\u001B[30m";
    public static final String R = "\u001B[31m"; // RED
    public static final String G = "\u001B[32m"; // Green
    public static final String Y = "\u001B[33m"; // Yellow
    public static final String B = "\u001B[34m"; // Blue
    public static final String P = "\u001B[35m"; // Purple
    public static final String C = "\u001B[36m"; // Cyan
    public static final String W = "\u001B[37m"; // White
}