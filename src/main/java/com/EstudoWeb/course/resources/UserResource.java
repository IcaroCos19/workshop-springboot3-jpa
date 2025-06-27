package com.EstudoWeb.course.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import com.EstudoWeb.course.entities.User;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

   
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Jorge", "sexodeladinho@gmail.com", "99999999", "123456");
        return ResponseEntity.ok().body(u);
    }

    
}