package com.example.jogoVivi.Controller;

import com.example.jogoVivi.Modal.UserModal;
import com.example.jogoVivi.repositori.UserRep;
import com.example.jogoVivi.service.UserServe;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class UserController {
    @Autowired
    UserRep userRep;

    @PostMapping("/add")
    @CrossOrigin("http://127.0.0.1:5501")
    public ResponseEntity<Object> adduser(@RequestBody UserModal userModal){
        UserServe userServe = new UserServe();
        return userServe.findSave(userModal,userRep);
    }
//    @PostMapping("/points")
//    public ResponseEntity<Object> points(@RequestBody UserModal userModal){
//        UserServe userServe = new UserServe();
//        return userServe.findSave(userModal,userRep);
//    }
    @PostMapping("/points/{id}")
    public ResponseEntity<Object> points(@RequestBody UserModal userModal){
        UserServe userServe = new UserServe();
        return userServe.findSave(userModal,userRep);
    }
//    @PutMapping("/products/{id}")
//    public ResponseEntity<Object> upadateProduct(@PathVariable(value = "id") UUID id, @RequestBody @Valid ProductrecordDto productrecordDto ){
//        Optional<ProductModel> prduct0 = productRepository.findById(id);
//        if (prduct0.isEmpty()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
//        }
//        var productModel = prduct0.get();
//        BeanUtils.copyProperties(productrecordDto,productModel);
//        return ResponseEntity.status(HttpStatus.OK).body(productRepository.save(productModel));
//    }

}
