package bullGame.service;

import bullGame.model.User;
import bullGame.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Макс on 20.11.2017.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllDepartments() {
        return userRepository.findAll();
    }

    public User saveDepartment(User user) {
        return userRepository.save(user);
    }

    public void deleteDepartment(User user) {
        userRepository.delete(user);
    }

    public User findDepartmentById(long userId) {
        return userRepository.findOne(userId);
    }
}
