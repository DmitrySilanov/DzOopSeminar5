package Model;

public abstract class User {

    public User(String firstName, String lastNAme, String middleName) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.middleName = middleName;
    }

    private String firstName;

    private String lastNAme;

    private String middleName;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastNAme='" + lastNAme + '\'' +
                ", middleName='" + middleName + '\'' +
                '}';
    }
}


