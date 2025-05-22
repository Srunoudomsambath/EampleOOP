package readandwrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class ReadAndWrite {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream = new FileOutputStream("Person.txt")){
            fileOutputStream.write("Hello,world".getBytes());
            System.out.println("Successfully wrote to the file.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        //Read from the file
        try(FileInputStream fileInputStream = new FileInputStream("Person.txt")){
            int ch ;
            System.out.print("Data read from the file : ");
            while((ch=fileInputStream.read())!=-1){
                System.out.print((char)ch);
            }
            System.out.println();

        }catch (Exception e) {
            System.out.println("Read Error:" + e.getMessage());
        }
        //Read form the file
        try(FileInputStream fis = new FileInputStream("Person.txt")){
            while (true){
                int data = fis.read();
                if(data==-1){
                    break;
                }
                System.out.print((char)data);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        //Write with character and convert to standard charset
        try(FileOutputStream fio = new FileOutputStream("Example.txt",true)){
            System.out.println("Insert data into the file");
            byte[] data = "Hello,world".getBytes(StandardCharsets.UTF_8);
            fio.write(data);
            System.out.println(Arrays.toString(data));
            System.out.println("Successfully wrote to the file.");
        }catch (Exception e ){
            System.out.println(e.getMessage());
        }

        //User input text to the file
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter text to save to file ");
        try(FileOutputStream fos = new FileOutputStream("userInput.txt")){
            while(true){
                String input = scanner.nextLine();
                if(input.equals("exit")){
                    break;
                }
                input += System.lineSeparator();
                fos.write(input.getBytes(StandardCharsets.UTF_8));
                System.out.println("Text saved");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
//        //Delete file
//        File file = new File("UserInput.txt");
//        if(file.delete()){
//            System.out.println("file deleted successfully");
//        }else{
//            System.out.println("File could not be deleted");
//        }
        //User input to delete
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the name of the file to delete : ");
        String filename = scanner1.nextLine();
        File file = new File(filename);
        if(file.exists()){
            if(file.delete()){
                System.out.println("File" + filename + " deleted successfully");
            }else{
                System.out.println("File" + filename + " could not be deleted");
            }
        }else{
            System.out.println("File" + filename + " does not exist");
        }
        scanner.close();
    }
}
