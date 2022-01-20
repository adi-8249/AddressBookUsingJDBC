package Model;

public class Person
{
    private String first_name;
    private String last_name;
    private String city;
    private String zip_code;
    private String phone_Number;

    public void setFirst_name(String first_name)
    {
        this.first_name=first_name;
    }
    public String getFirst_name()
    {
        return first_name;
    }

    public void setLast_name(String last_name)
    {
        this.last_name=last_name;
    }
    public String getLast_name()
    {
        return last_name;
    }

    public void setCity(String city)
    {
        this.city=city;
    }
    public String getCity()
    {
        return city;
    }

    public void setZip_code(String zip_code)
    {
        this.zip_code=zip_code;
    }
    public String getZip_code()
    {
        return zip_code;
    }

    public void setPhone_Number(String phone_Number)
    {
        this.phone_Number=phone_Number;
    }
    public String getPhone_Number()
    {
        return phone_Number;
    }
}
