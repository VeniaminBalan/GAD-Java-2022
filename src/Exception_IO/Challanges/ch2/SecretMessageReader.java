package Exception_IO.Challanges.ch2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessageReader {

    public static void ReadMessage(String path){

        File file = new File(path);

        try (FileReader fr = new FileReader(file))
        {
            int content;
            while ((content = fr.read()) != -1) {
                if((char)content == 'X') System.out.print(" ");
                else if( ((char)content > 'A') && ( (char)content < 'Z')){
                    System.out.print((char)content);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
