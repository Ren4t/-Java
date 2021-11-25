package homework1;

public class PersonBuilder {
    private Person person;

    public PersonBuilder(){
        person = new Person();
    }

    public PersonBuilder firstName(String firstname){
        person.setFirstName(firstname);
        return this;
    }
    public PersonBuilder lastName(String lastname){
        person.setLastName(lastname);
        return this;
    }
    public PersonBuilder middleName(String middlename){
        person.setMiddleName(middlename);
        return this;
    }
    public PersonBuilder country(String country){
        person.setCountry(country);
        return this;
    }
    public PersonBuilder address(String address){
        person.setAddress(address);
        return this;
    }
    public PersonBuilder phone(String phone){
        person.setPhone(phone);
        return this;
    }
    public PersonBuilder age(int age){
        person.setAge(age);
        return this;
    }
    public PersonBuilder gender(String gender){
        person.setGender(gender);
        return this;
    }
    public Person build(){
        return person;
    }
}
