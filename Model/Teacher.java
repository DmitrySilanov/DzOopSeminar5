package Model;

public class Teacher extends User {

    public Teacher(String firstName, String lastNAme, String middleName, int teacherId) {
        super(firstName, lastNAme, middleName);
        this.teacherId = teacherId;
    }

    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                "firstName='" + super.getFirstName() + '\'' +
                ",lastName='" + super.getLastNAme() + '\'' +
                ",middleName ='" + super.getMiddleName() + '\'' +
                '}';
    }
}
