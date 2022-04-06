package com.example.myviewofbookingsystem.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    /**
     * Provides all the fields that must be filled in for user registration
     * @return till null
     */
    @GetMapping("/register")
    public ResponseEntity<UserRegisterDTO> register (){
        return null;
    }

    @GetMapping("/id")
    public ResponseEntity getById(@PathVariable  Long id) {
        return null;
    }

    @PostMapping
    public ResponseEntity addUser(@RequestBody User user) {
        return null;
    }


    @PutMapping("/userid")
    public ResponseEntity addUser(@RequestBody User user ,@PathVariable Long id) {
        return null;
    }
}
