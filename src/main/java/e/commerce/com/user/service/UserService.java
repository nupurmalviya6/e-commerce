package e.commerce.com.user.service;

import e.commerce.com.user.dto.UserDto;
import e.commerce.com.user.model.User;
import e.commerce.com.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserDetails(Integer id) {
        return userRepository.findById(id);
    }

    public User addUser(UserDto userDto) {
        User user=new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        user.setAge(userDto.getAge());
        return userRepository.save(user);
    }


}
