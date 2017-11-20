package bullGame.service;

import bullGame.model.Users;
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

    public List<Users> findAllUsers() {
        return userRepository.findAll();
    }

    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    public void deleteUser(Users users) {
        userRepository.delete(users);
    }

    public Users findUserById(int userId) {
        return userRepository.findOne(userId);
    }
}
