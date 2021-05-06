package demoproject.lovely_pets.back.service;

import demoproject.lovely_pets.back.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void delete(User user);
    User read(Long id);
    User update(User user);
    List<User> getAllUser();
}
