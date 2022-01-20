package Controller;

import Model.Person;
import Service.AddressBookService;

import java.sql.SQLException;
import java.util.List;

public class AddressBookController {
    AddressBookService addressBookService = new AddressBookService();

    public void insertDB(String first_name, String last_name, String city, String phone_number) {
        Person person = new Person();
        person.setFirst_name(first_name);
        person.setLast_name(last_name);
        person.setCity(city);
        person.setPhone_Number(phone_number);
        try {
            addressBookService.insertData(person);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateContactDB(String first_name, String phone_number) {
        Person person = new Person();
        person.setFirst_name(first_name);
        person.setPhone_Number(phone_number);
        try {
            addressBookService.updateContact(person);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateContactLast_nameDB(String last_name, String phone_number) {
        Person person = new Person();
        person.setLast_name(last_name);
        person.setPhone_Number(phone_number);
        try {
            addressBookService.updateContactLast_name(person);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void updateCityDB(String city, String phone_Number) {
        Person person = new Person();
        person.setCity(city);
        person.setPhone_Number(phone_Number);
        try {
            addressBookService.updateContactCity(person);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void deleteContactDB(String phone_Number) {
        Person person = new Person();
        person.setPhone_Number(phone_Number);
        try {
            addressBookService.deleteContact(person);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<Person> displayDB(){
        try {
            return addressBookService.displayAll();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Person searchContact(String sP_no) {
        try {
            return addressBookService.searchContact(sP_no);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  List<Person> sort_DB_ByFirstname() {
        try {
            return addressBookService.sortAll();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  List<Person> sort_DB_ByLastname() {
        try {
            return addressBookService.sort_Ln();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  List<Person> sort_DB_ByCity(){
        try {
            return addressBookService.sort_cty();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    public  List<Person> sort_DB_ByPhone_Number(){
        try {
            return addressBookService.sort_ph();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
