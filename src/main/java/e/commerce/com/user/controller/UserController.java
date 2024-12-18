package e.commerce.com.user.controller;


import e.commerce.com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public String getUserDetails(@PathVariable Integer id){
        return userService.getUserDetails(id);
    }
}
