package Exception_IO.Challanges.ch1;

import java.io.*;
import java.util.Scanner;
import java.util.stream.Stream;

public class PhoneBook {
    Contact[] contacts;
    int lenght;

    public PhoneBook()
    {
        contacts = new Contact[5000];
    }

    public void BookInput(String path){

        Scanner s = null;
        try{
            s = new Scanner(new BufferedReader(new FileReader(path)));

            int i =0;
            while(s.hasNext()){
                Contact cont = new Contact();
                cont.name = s.next();
                cont.phoneNumber = s.next();

                contacts[i] = cont;
                i++;
            }
            lenght = i;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(s!=null) s.close();
        }
    }

    public void FindPhoneNumberByName(String name)
    {
        for (int i=0;i<lenght;i++){
            if(contacts[i].name.equals(name)){
                System.out.println(contacts[i].phoneNumber);
            }
        }
    }
}
