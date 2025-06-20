package joshiBack.miBack.services;
import joshiBack.miBack.model.User;
import joshiBack.miBack.payload.response.UserResponse;
import joshiBack.miBack.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserResponse::new)
                .collect(Collectors.toList());
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User userData) {
        User user = userRepository.findById(id).orElseThrow();
        user.setUsername(userData.getUsername());
        user.setEmail(userData.getEmail());
        return userRepository.save(user);
    }
}
