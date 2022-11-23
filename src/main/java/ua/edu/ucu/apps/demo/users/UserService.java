package ua.edu.ucu.apps.demo.users;

import org.springframework.stereotype.Service;
import ua.edu.ucu.apps.demo.flower.FlowerRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<MyUser> getUsers() {
        return userRepository.findAll();
    }

    public void addUsers(MyUser user) {
        if (userRepository.findMyUserByEmail(user.getEmail()).isEmpty()) {
            userRepository.save(user);
        }
    }
}
