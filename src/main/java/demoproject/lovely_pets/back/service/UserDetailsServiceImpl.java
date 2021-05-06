package demoproject.lovely_pets.back.service;

import demoproject.lovely_pets.back.repository.UserRepository;
import demoproject.lovely_pets.back.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserService{

    private final UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public User read(Long id) {
        return userRepository.getOne(id);
    }

    @Override
    public User update(User user) {
        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
