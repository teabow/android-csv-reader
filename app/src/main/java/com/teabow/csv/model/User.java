package com.teabow.csv.model;

import com.teabow.csv.annotation.CSVAnnotation;

/**
 * Created by teabow on 01/02/15.
 */
public class User extends Object {

    private String lastname;

    private String firstname;

    private String city;

    public String getLastname() {
        return lastname;
    }

    @CSVAnnotation.CSVSetter(info = "lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @CSVAnnotation.CSVSetter(info = "firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getCity() {
        return city;
    }

    @CSVAnnotation.CSVSetter(info = "city")
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!city.equals(user.city)) return false;
        if (!firstname.equals(user.firstname)) return false;
        if (!lastname.equals(user.lastname)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lastname.hashCode();
        result = 31 * result + firstname.hashCode();
        result = 31 * result + city.hashCode();
        return result;
    }
}
