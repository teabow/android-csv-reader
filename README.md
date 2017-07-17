# android-csv-reader
An Android csv reader implementation with annotations

From a `users.csv` file :

```
lastname,fisrtname,city
Bryant,Kobe,Los Angeles
James,LeBron,Akron
Parker,Tony,Paris
```

Create the related model with CSVAnnotations :

```java
public class User {

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
}
```

Then you can use the CSVReader.readFile method to parse users from an Activity (first parameter is context) :

```java
 List<Object> users = CSVReader.readFile(this, R.raw.users, User.class);
```
