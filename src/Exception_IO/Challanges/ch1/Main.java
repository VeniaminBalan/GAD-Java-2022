package Exception_IO.Challanges.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.BookInput("src/Exception_IO/Challanges/ch1/PhoneBook");
        phoneBook.FindPhoneNumberByName("Abbey");
        phoneBook.FindPhoneNumberByName("Abdul");
    }
}
