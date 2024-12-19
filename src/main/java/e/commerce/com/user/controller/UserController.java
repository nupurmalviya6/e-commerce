package e.commerce.com.user.controller;


import e.commerce.com.user.dto.UserDto;
import e.commerce.com.user.model.User;
import e.commerce.com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUserDetails(@PathVariable Integer id){
        return ResponseEntity.ok(userService.getUserDetails(id));
    }

    @PostMapping("/user")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto){
       return ResponseEntity.ok(userService.addUser(userDto));
    }


}
