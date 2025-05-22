package readandwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class JpgToPng {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream
                    = new FileInputStream("durian.jpg")){
            Integer data = 0;
            try(FileOutputStream fileOutputStream
                        = new FileOutputStream("Durian-1.png")){
                while ((data=fileInputStream.read())!=-1){
                    fileOutputStream.write(data.byteValue());
                }
                System.out.println("Created new durian :)");
            }
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}



