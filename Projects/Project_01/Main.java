//package Projects.Project_01;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int NumOfStudent;
        String FileName = "Student_Info.txt";

        System.out.print("Enter no.of Student : ");
        NumOfStudent = scanner.nextInt();

        Student_info[] student = new Student_info[NumOfStudent];
        RemoveData removeData = new RemoveData();
        

        removeData.ClearAll(FileName);

        Input_Info.input(student, NumOfStudent, scanner);

        WriteFile.Write(FileName, NumOfStudent, student);

        ReadDataOnly.Data(FileName);
       
        Print_Info_Current.Print(student, NumOfStudent);

        ReaderFile.Read(FileName);

        scanner.close();
    }
}

class Student_info {
    int roll_no;
    int age;
    int birthYear;
    String name;
    String course;
    String address;
    long contact;
}

class Input_Info {
    public static void input(Student_info[] student, int NumOfStudent, Scanner scanner){
        for(int i = 0; i < NumOfStudent; i++){
            student[i] = new Student_info();

            System.out.println();

            System.out.println(Colors.G + "Student-" + (i+1) + Colors.W);

            System.out.print(Colors.C + "Enter The Roll Number: " + Colors.W);
            student[i].roll_no = scanner.nextInt();
            
            System.out.print(Colors.C + "Enter The Age : " + Colors.W);
            student[i].age = scanner.nextInt();
            
            System.out.print(Colors.C + "Enter The Birth Year : " + Colors.W);
            student[i].birthYear = scanner.nextInt();

            scanner.nextLine();
            
            System.out.print(Colors.C + "Enter The Name : " + Colors.W);
            student[i].name = scanner.nextLine();
            
            System.out.print(Colors.C + "Enter The Course : " + Colors.W);
            student[i].course = scanner.nextLine();
            
            System.out.print(Colors.C + "Enter The Address : " + Colors.W);
            student[i].address = scanner.nextLine();
            
            System.out.print(Colors.C + "Enter The Contact 10-Digit : " + Colors.W);
            student[i].contact = scanner.nextLong();

            System.out.println();
        }
        
    }
}

class WriteFile {
    public static void Write(String FileName, int NumOfStudent, Student_info[] student){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FileName, true))){

            for(int i = 0; i < NumOfStudent; i++){

                writer.write("Student-" + (i + 1));

                writer.newLine();
                writer.write("-------------------------------------------");
                writer.newLine();
    
                writer.write(String.valueOf("Roll Number Is : " + student[i].roll_no));
                writer.newLine();
                writer.write(String.valueOf("Age Is : " + student[i].age));
                writer.newLine();
                writer.write(String.valueOf("Birth Year Is : " + student[i].birthYear));
                writer.newLine();
                writer.write(String.valueOf("Name Is : " + student[i].name));
                writer.newLine();
                writer.write(String.valueOf("Course Is : " + student[i].course));
                writer.newLine();
                writer.write(String.valueOf("Address Is : " + student[i].address));
                writer.newLine();
                writer.write(String.valueOf("Contact Is : " + student[i].contact));
                writer.newLine();
                writer.newLine();
                System.out.println("Successes Student-" + (i + 1) + "\n");
            }
        }
        catch(IOException e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}

class ReaderFile {
    public static void Read(String FileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(FileName))){
            String Line;
            while((Line = reader.readLine()) != null){
                System.out.println(Line);
            }
        }
        catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}

class ReadDataOnly {
    public static void Data(String FileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(FileName))){
            String Line;
            while((Line = reader.readLine()) != null){
                if(Line.startsWith("Roll Number Is : ")){
                    System.out.println(Line.split("Roll Number Is : ")[1]);
                }
                else if(Line.startsWith("Age Is : ")){
                    System.out.println(Line.split("Age Is : ")[1]);
                }
                else if(Line.startsWith("Birth-Year Is : ")){
                    System.out.println(Line.split("Birth-Year  Is: ")[1]);
                }
                else if(Line.startsWith("Name Is : ")){
                    System.out.println(Line.split("Name Is : ")[1]);
                }
                else if(Line.startsWith("Course Is : ")){
                    System.out.println(Line.split("Course Is : ")[1]);
                }
                else if(Line.startsWith("Address Is : ")){
                    System.out.println(Line.split("Address Is : ")[1]);
                }
                else if(Line.startsWith("Contact Is : ")){
                    System.out.println(Line.split("Contact Is : ")[1]);
                }
            }
        }
        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}

class Print_Info_Current {
    public static void Print(Student_info[] s, int n){    
        for(int i = 0; i < n; i++){

            System.out.println("\n");
            System.out.println(Colors.P + "Student-" + (i + 1) + Colors.W);

            System.out.println(Colors.B + "Student Roll Number : " + Colors.G + s[i].roll_no + Colors.W);
            System.out.println(Colors.B + "Student Age : " + Colors.G + s[i].age + Colors.W);
            System.out.println(Colors.B + "Student Birth-Year : " + Colors.G + s[i].birthYear + Colors.W);
            System.out.println(Colors.B + "Student Name : " + Colors.G + s[i].name + Colors.W);
            System.out.println(Colors.B + "Student Course : " + Colors.G + s[i].course + Colors.W);
            System.out.println(Colors.B + "Student Address : " + Colors.G + s[i].address + Colors.W);
            System.out.println(Colors.B + "Student Contact : " + Colors.G + s[i].contact + Colors.W);

            System.out.println("\n");
        }
    }
}

class RemoveData {
    public void ClearAll(String FileName){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FileName))){
            writer.write(" ");
        }
        catch(IOException e){
            System.out.println("Error" + e.getMessage());
        }
    }
}

class Colors {
    public static String Reset = "\u001B[30m";
    public static String R = "\u001B[31m"; //Red
    public static String G = "\u001B[32m"; //Green
    public static String Y = "\u001B[33m"; //Yellow
    public static String B = "\u001B[34m"; //Blue
    public static String P = "\u001B[35m"; //Purple
    public static String C = "\u001B[36m"; //Cyan
    public static String W = "\u001B[37m"; //White
}