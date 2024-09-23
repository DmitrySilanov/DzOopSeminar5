package View;

import Model.Teacher;

import java.util.List;

public class TeacherView implements UserView {


    @Override
    public void sendOnConsole(List<Teacher> list) {
        for (Teacher teacher : list) {
            System.out.println(teacher);
        }
    }
}
