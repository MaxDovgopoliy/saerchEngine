package search;

public class Person {
    String name;
    String surname;

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' +
                 email + ' ';
    }

    public Person(String... name) {
        this.name = name[0];
        if(name.length>1){
        this.surname = name[1];
        }
        if(name.length==3){
            this.email=name[2];
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    String email;
}
