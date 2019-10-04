package model.supervisor;

public class Supervisor {
    private String firstname;
    private String lastname;

    public Supervisor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
