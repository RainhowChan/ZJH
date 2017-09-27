package com.rainhowchan.zjh.po;

public class Person {
    private Integer idP;

    private String lastname;

    private String firstname;

    private String address;

    private String city;

    public Person(Integer idP, String lastname, String firstname, String address, String city) {
        this.idP = idP;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.city = city;
    }

    public Person() {
        super();
    }

    public Integer getIdP() {
        return idP;
    }

    public void setIdP(Integer idP) {
        this.idP = idP;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    @Override
    public String toString() {
        return "Person{" +
                "idP=" + idP +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}