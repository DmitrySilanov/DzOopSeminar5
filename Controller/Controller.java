package Controller;

import Model.Student;
import Model.Teacher;
import Model.Type;
import Model.User;
import Service.DataService;
import Service.StudentGroupService;
import View.StudentGroupView;
import View.StudentView;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StudentView studentView = new StudentView();
    private final TeacherView teacherView = new TeacherView();
    private final StudentGroupView studentGroupView = new StudentGroupView();
    public void createStudent(String firstName, String lastName, String middleName){
        dataService.create(firstName, lastName, middleName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String lastName, String middleName){
        dataService.create(firstName, lastName, middleName, Type.TEACHER);
    }
    public void getAllStudents(){
        studentView.sendOnConsole(dataService.getAllStudents());
    }
    public void getAllTeachers(){
        teacherView.sendOnConsole(dataService.getAllTeachers());
    }
    public void createStudentGroup(Integer teacherId, List<Integer> studentIdList){
        Teacher teacher = (Teacher) dataService.getUserById(Type.TEACHER, teacherId);
        List<Student> studentList = new ArrayList<>();
        for (Integer id:studentIdList) {
            studentList.add((Student) dataService.getUserById(Type.STUDENT, id));
        }
        studentGroupService.createStudentGroup(teacher,studentList);
    }
    public void printStudentGroup(){
        studentGroupView.sendOnConsole(studentGroupService.getStudentGroup());
    }
}
