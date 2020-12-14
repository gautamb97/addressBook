import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Set;
public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        Person person_deatils = new Person();
        person_deatils.addPersonInfo();
    }
}
//Creating a class for person
class Person{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
    long phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //Adding Person in Address book
    public void addPersonInfo(){
        Scanner personDetails = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        setFirstName(personDetails.next());
        System.out.println("Enter your last name: ");
        setLastName(personDetails.next());
        System.out.println("Enter your address: ");
        setAddress(personDetails.nextLine());
        setAddress(personDetails.nextLine());
        System.out.println("Enter your city: ");
        setCity(personDetails.next());
        System.out.println("Enter your State: ");
        setState(personDetails.next());
        System.out.println("Enter your Zip Code: ");
        setZip(personDetails.nextInt());
        System.out.println("Enter your phone number: ");
        setPhoneNumber(personDetails.nextInt());
        List<String> personDetailsSet = new ArrayList<>();
            personDetailsSet.add("Name= "+getFirstName()+" "+getLastName());
            personDetailsSet.add("Address= "+getAddress());
            personDetailsSet.add("City= "+getCity());
            personDetailsSet.add("State= "+getState());
            personDetailsSet.add("Zip Code= "+getZip());
            personDetailsSet.add("Phone Number= "+getPhoneNumber());
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println(personDetailsSet);
        System.out.println("--------------------------------------------------------------------------------------------------");
    }
}
