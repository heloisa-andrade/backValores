package com.example.jogoVivi.Controller;

import com.example.jogoVivi.Modal.UserModal;
import com.example.jogoVivi.repositori.UserRep;
import com.example.jogoVivi.service.UserServe;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
public class UserController {
    @Autowired
    UserRep userRep;

    @PostMapping("/add")
    public ResponseEntity<Object> adduser(@RequestBody UserModal userModal){
        UserServe userServe = new UserServe();
        return userServe.findSave(userModal,userRep);
    }
    public List<UserModal> getAllCpf() {
        return userRep.findAll();
    }

    @PostMapping("/points/{id}")
    public ResponseEntity<Object> points(@RequestBody UserModal userModal){
        UserServe userServe = new UserServe();
        return userServe.findSave(userModal,userRep);
    }


}
