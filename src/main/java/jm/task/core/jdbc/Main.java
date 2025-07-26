package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();             //sozdat` tablucy userov

        userService.saveUser("Name", "LastName", (byte) 18);
        userService.saveUser("Anna", "Ivanova", (byte) 22);
        userService.saveUser("Mike", "Vazovski", (byte) 33);
        userService.saveUser("Ivan", "Ivanov", (byte) 49); // dobavit` userov

        System.out.println(userService.getAllUsers()); // poluchit` vseh userov BD + vivesti v konsol`

        userService.cleanUsersTable(); //ochistka tablici userov
        userService.dropUsersTable(); //udalenie tablici
    }
}
