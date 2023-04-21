//package com.authentication.controller12;
//
//import com.authentication.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@CrossOrigin("*")
//public class UserController {
//    @Autowired
//    UserRepository userRepository;
//
//    @GetMapping("/test")
//    public ResponseEntity test() {
//        return ResponseEntity.ok(userRepository.findAll());
//    }
//}
