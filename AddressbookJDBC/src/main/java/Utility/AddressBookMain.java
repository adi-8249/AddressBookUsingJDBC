package Utility;

import Controller.AddressBookController;
import Model.Person;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        int choice;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter your choice");
            System.out.println("1 for insert");
            System.out.println("2 for update first name, LastName And City");
            System.out.println("3 for Delete Contact");
            System.out.println("4 Display the all the data");
            System.out.println("5 Search contact from database");
            System.out.println("6 sort operations");
            choice = sc.nextInt();
            AddressBookController controller = new AddressBookController();

            switch (choice) {
                case 1:
                    System.out.println("Enter first name");
                    String first_name = sc.next();
                    System.out.println("Enter last name");
                    String last_name = sc.next();
                    System.out.println("Enter city name");
                    String city = sc.next();
                    System.out.println("Enter Phone number here");
                    String phone_number = sc.next();
                    controller.insertDB(first_name, last_name, city, phone_number);
                    break;
                case 2:
                    int updateChoice;
                    do {
                        System.out.println("you are in update operation");
                        System.out.println("enter which update you want");
                        System.out.println("1 for update first name");
                        System.out.println("2 for update last name");
                        System.out.println("3 for update city");
                        System.out.println("0 for exit");
                        updateChoice = sc.nextInt();
                        switch (updateChoice) {
                            case 1:
                                System.out.println("enter the phone_number to edit FirstName");
                                String Update_no = sc.next();
                                System.out.println("enter new first name");
                                String updateFirstName = sc.next();
                                controller.updateContactDB(updateFirstName, Update_no);
                                break;
                            case 2:
                                System.out.println("enter the Phone number to edit LastName");
                                String Lp_no = sc.next();
                                System.out.println("enter new last name");
                                String Last_name = sc.next();
                                controller.updateContactLast_nameDB(Last_name, Lp_no);
                                break;
                            case 3:
                                System.out.println("enter phone Number to edit City");
                                String Cp_no = sc.next();
                                System.out.println("enter new City");
                                String CITY = sc.next();
                                controller.updateCityDB(CITY, Cp_no);
                                break;
                            default:
                                System.out.println("You have entered wrong input");
                        }
                    } while (updateChoice != 0);
                    break;
                case 3:
                    System.out.println("you are in delete operation");
                    System.out.println("enter phone_number to delete contact data");
                    String dP_no = sc.next();
                    controller.deleteContactDB(dP_no);
                    System.out.println("Successfully deleted your selected Data");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("the total dataBase is :");
                    for (Person each : controller.displayDB()) {
                        System.out.println("first name - " + each.getFirst_name());
                        System.out.println("last name - " + each.getLast_name());
                        System.out.println("city - " + each.getCity());
                        System.out.println("phone_number- " + each.getPhone_Number());
                        System.out.println("This all about your data base");
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("enter the phone_number to get details of contact");
                    String sP_no = sc.next();
                    System.out.println("get contact details");
                    Person person = controller.searchContact(sP_no);
                    System.out.println("first name - " + person.getFirst_name());
                    System.out.println("last name - " + person.getLast_name());
                    System.out.println("city - " + person.getCity());
                    System.out.println("phone number - " + person.getPhone_Number());
                    System.out.println();
                    break;
                case 6:
                    int sortChoice;
                    do {
                        System.out.println("enter your choice for sorting");
                        System.out.println("1 to sort by first name");
                        System.out.println("2 to sort by last name");
                        System.out.println("3 to sort by  city");
                        System.out.println("4 to sort by phone number");
                        System.out.println("0 to exit from sort operations");
                        sortChoice = sc.nextInt();
                        switch (sortChoice) {
                            case 1:
                                for (Person each : controller.sort_DB_ByFirstname()) {
                                    System.out.println("first name - " + each.getFirst_name());
                                    System.out.println("last name - " + each.getLast_name());
                                    System.out.println("city - " + each.getCity());
                                    System.out.println("phone_number- " + each.getPhone_Number());
                                    System.out.println();
                                }
                                break;
                            case 2:
                                for(Person each : controller.sort_DB_ByLastname()){
                                    System.out.println("first name - "+each.getFirst_name());
                                    System.out.println("last name - "+each.getLast_name());
                                    System.out.println("city - "+each.getCity());
                                    System.out.println("p_no - "+each.getPhone_Number());
                                    System.out.println();
                                }
                                break;
                            case 3:
                                for(Person each : controller.sort_DB_ByCity()){
                                    System.out.println("first name - "+each.getFirst_name());
                                    System.out.println("last name - "+each.getLast_name());
                                    System.out.println("city - "+each.getCity());
                                    System.out.println("phone_number - "+each.getPhone_Number());
                                    System.out.println();
                                }
                                break;
                            case 4:
                                for(Person each : controller.sort_DB_ByPhone_Number()){
                                    System.out.println("first name - "+each.getFirst_name());
                                    System.out.println("last name - "+each.getLast_name());
                                    System.out.println("city - "+each.getCity());
                                    System.out.println("phone_Number - "+each.getPhone_Number());
                                    System.out.println();
                                }
                                break;
                        }
                    } while (sortChoice != 0);
            }
        } while (choice != 0);
    }
}



