package Repo;

import Model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBookRepo
{
    String url="jdbc:mysql://localhost:3306/database1?useSSL=false";
    String user="root";
    String password="RootPassword";

    public void insert(Person person) throws SQLException {
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection= DriverManager.getConnection(url, user, password);
        String sql= "INSERT INTO database1.employee_table (first_name,last_name,city,phone_number)" + "VALUES(?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,person.getFirst_name());
        statement.setString(2,person.getLast_name());
        statement.setString(3,person.getCity());
        statement.setString(4,person.getPhone_Number());
        statement.executeUpdate();
    }
    public  void update(Person person) throws SQLException {
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqlUpdate = "UPDATE database1.employee_table SET first_name=? WHERE phone_Number=?";
        PreparedStatement statement = connection.prepareStatement(sqlUpdate);
        statement.setString(1,person.getFirst_name());
        statement.setString(2,person.getPhone_Number());
        statement.executeUpdate();
    }
    public void updateL_name(Person person) throws SQLException {
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqlUpdate = "UPDATE database1.employee_table SET last_name=? WHERE phone_Number=?";
        PreparedStatement statement = connection.prepareStatement(sqlUpdate);
        statement.setString(1,person.getLast_name());
        statement.setString(2,person.getPhone_Number());
        statement.executeUpdate();
    }
    public void updateCity(Person person) throws SQLException {
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection= DriverManager.getConnection(url, user, password);
        String sqlUpdate = "UPDATE database1.employee_table SET city=? WHERE phone_Number=?";
        PreparedStatement statement = connection.prepareStatement(sqlUpdate);
        statement.setString(1,person.getCity());
        statement.setString(2,person.getPhone_Number());
        statement.executeUpdate();
    }
    public void delete(Person person) throws SQLException {
        try {
            Class.forName("java.sql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection(url, user, password);
        String sqlDelete = "DELETE FROM database1.employee_table WHERE phone_number=?";
        PreparedStatement statement = connection.prepareStatement(sqlDelete);
        statement.setString(1, person.getPhone_Number());
        statement.executeUpdate();
    }
    public List<Person> display() throws ClassNotFoundException, SQLException {
        List<Person> personList = new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        String dis = "SELECT * FROM database1.employee_table";
        Statement s = connection.createStatement();
        ResultSet resultSet = s.executeQuery(dis);
        while (resultSet.next()) {
            Person person = new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setPhone_Number(resultSet.getString("Phone_Number"));
            personList.add(person);
        }
        return personList;
    }
    public Person search(String p_no) throws ClassNotFoundException, SQLException {
        Person person = new Person();
        Class.forName("java.sql.Driver");
        Connection connection = DriverManager.getConnection(url, user, password);
        String srch = "SELECT * FROM database1.employee_table WHERE phone_number= ?";
        PreparedStatement s = connection.prepareStatement(srch);
        s.setString(1,p_no);
        ResultSet resultSet = s.executeQuery();
        while(resultSet.next()){
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setPhone_Number(resultSet.getString("phone_number"));
        }
        return person;
    }
    public List<Person> sort() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM database1.employee_table ORDER BY first_name";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setPhone_Number(resultSet.getString("phone_Number"));
            personList.add(person);
        }
        return  personList;
    }
    public List<Person> sortByLn() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM database1.employee_table ORDER BY last_name";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setPhone_Number(resultSet.getString("phone_number"));
            personList.add(person);
        }
        return  personList;
    }
    public List<Person> sortByC() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM database1.employee_table ORDER BY city";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setPhone_Number(resultSet.getString("phone_number"));
            personList.add(person);
        }
        return  personList;
    }
    public List<Person> sortByp() throws ClassNotFoundException, SQLException {
        List<Person> personList=new ArrayList<>();
        Class.forName("java.sql.Driver");
        Connection connection= DriverManager.getConnection(url, user, password);
        String dis="SELECT * FROM database1.employee_table ORDER BY phone_number";
        Statement s=connection.createStatement();
        ResultSet resultSet=s.executeQuery(dis);
        while (resultSet.next()){
            Person person=new Person();
            person.setFirst_name(resultSet.getString("first_name"));
            person.setLast_name(resultSet.getString("last_name"));
            person.setCity(resultSet.getString("city"));
            person.setPhone_Number(resultSet.getString("phone_number"));
            personList.add(person);
        }
        return  personList;
    }
}


