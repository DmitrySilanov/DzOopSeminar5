package View;

import Model.Teacher;
import Model.User;

import java.util.List;

public interface UserView<T extends User> {
    public void sendOnConsole(List<T> list);

}
