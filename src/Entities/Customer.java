package Entities;

import Abstract.IEntity;

public class Customer implements IEntity {
    public int id;
    public String firstName;
    public String lastName;
    public int dateOfBirth;
    public String nationalityId;

    public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }
}
