/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Roles;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class PersonDirectory {
    ArrayList<Person> persons;

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public PersonDirectory() {
        persons = new ArrayList<>();
    }
    
    public Person createPerson(String name,String streetAddress,String city,String state,String zipcode,String phone,String fax,String emailAddress, String country){
        Person p = new Person(name, streetAddress, city, state, zipcode, phone, fax, emailAddress, country);
        persons.add(p);
        return  p;
    }
    
    public void removePerson(int index){
        persons.remove(index);
    }
}
