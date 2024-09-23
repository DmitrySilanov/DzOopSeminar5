package Model;

public class Student extends User {

    public Student(String firstName, String lastNAme, String middleName, int studentId) {
        super(firstName, lastNAme, middleName);
        this.studentId = studentId;
    }

    private int studentId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacherId=" + studentId +
                "firstName='" + super.getFirstName() + '\'' +
                ", lastName='" + super.getLastNAme() + '\'' +
                ", middleName='" + super.getMiddleName() + '\'' +
                '}';
    }
}

