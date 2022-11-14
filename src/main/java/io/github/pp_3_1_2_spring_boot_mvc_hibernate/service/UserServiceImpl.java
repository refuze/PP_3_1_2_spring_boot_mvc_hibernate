package io.github.pp_3_1_2_spring_boot_mvc_hibernate.service;

import io.github.pp_3_1_2_spring_boot_mvc_hibernate.dao.UserDao;
import io.github.pp_3_1_2_spring_boot_mvc_hibernate.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    public List<User> getList() {
        return userDao.getList();
    }

    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }
}
