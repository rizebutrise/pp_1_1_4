package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDaoJDBCImpl();

    @Override
    public void createUsersTable() {
        try {
            userDao.createUsersTable();
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при создании таблицы", e);
        }
    }

    @Override
    public void dropUsersTable() {
        try {
            userDao.dropUsersTable();
        } catch (Exception e) {
            throw new RuntimeException("Ошибка дропа таблицы", e);
        }
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        try {
            userDao.saveUser(name, lastName, age);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка сохранения озера", e);
        }
    }

    @Override
    public void removeUserById(long id) {
        try {
            userDao.removeUserById(id);
        } catch (Exception e) {
            throw new RuntimeException("Ошибка при удалении юзера", e);
        }
    }


    public List<User> getAllUsers() {
        try {
            return userDao.getAllUsers();
        } catch (Exception e) {
            throw new RuntimeException("Ошибка получения юзеров", e);
        }
    }

    public void cleanUsersTable() {
        try {
            userDao.cleanUsersTable();
        } catch (Exception e) {
            throw new RuntimeException("Ошибка очистки таблицы", e);
        }
    }
}

