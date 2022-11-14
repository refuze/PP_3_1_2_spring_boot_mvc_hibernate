package io.github.pp_3_1_2_spring_boot_mvc_hibernate.dao;

import io.github.pp_3_1_2_spring_boot_mvc_hibernate.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    User get(Long id);

    List<User> getList();

    void update(User user);

    void delete(User user);
}
