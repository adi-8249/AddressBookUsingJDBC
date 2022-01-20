package Service;

import Model.Person;
import Repo.AddressBookRepo;

import java.sql.SQLException;
import java.util.List;

public class AddressBookService
{
    AddressBookRepo repo= new AddressBookRepo();
     public void insertData(Person person) throws SQLException, ClassNotFoundException
     {
         repo.insert(person);
     }
    public void updateContact(Person person) throws SQLException, ClassNotFoundException {
        repo.update(person);
    }
    public void updateContactLast_name(Person person) throws SQLException, ClassNotFoundException {
        repo.updateL_name(person);
    }
    public  void updateContactCity(Person person) throws SQLException, ClassNotFoundException {
        repo.updateCity(person);
    }
    public  void  deleteContact(Person person) throws SQLException, ClassNotFoundException {
        repo.delete(person);
    }
    public List<Person> displayAll() throws SQLException, ClassNotFoundException {
        return repo.display();
    }
    public  Person searchContact(String phone_number) throws SQLException, ClassNotFoundException {
        return repo.search(phone_number);
    }
    public List<Person> sortAll() throws SQLException, ClassNotFoundException {
        return repo.sort();
    }
    public List<Person> sort_Ln() throws SQLException, ClassNotFoundException {
        return repo.sortByLn();
    }
    public List<Person> sort_cty() throws SQLException, ClassNotFoundException {
        return repo.sortByC();
    }
    public List<Person> sort_ph() throws SQLException, ClassNotFoundException {
        return repo.sortByp();
    }


}
