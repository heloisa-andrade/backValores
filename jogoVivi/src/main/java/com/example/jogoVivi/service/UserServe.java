package com.example.jogoVivi.service;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.example.jogoVivi.Modal.UserModal;
import com.example.jogoVivi.repositori.UserRep;
import com.mongodb.client.result.UpdateResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UserServe {
    @Autowired
    private MongoTemplate mongoTemplate;
    private ResponseEntity<Object> save(UserModal userModal, UserRep userRep){
        return ResponseEntity.status(HttpStatus.CREATED).body(userRep.save(userModal));
    }
    public ResponseEntity<Object> find(UserModal userModal, UserRep userRep){
        String email = userModal.getEmail();
        Optional<UserModal> email1= userRep.findById(email);
        if (email1 != null){
            return ResponseEntity.status(HttpStatus.OK).body(email1.get());

        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("erro");
    }
    public ResponseEntity<Object> findSave(UserModal userModal, UserRep userRep){
        Optional<UserModal> email1= userRep.findById(userModal.getEmail());
        if (email1.isEmpty()){
            return save(userModal,userRep);
        }
        return ResponseEntity.status(HttpStatus.OK).body(email1.get());
    }

    public ResponseEntity<Object> pointSave(UserModal userModal, UserRep userRep) {
        Optional<UserModal> existingUser = userRep.findById(userModal.getEmail());

        if (existingUser.isEmpty()) {
            Query query = new Query(Criteria.where("email").is(userModal.getEmail())); // Correção na busca
            Update update = new Update().set("points", userModal.getPoints());

            UpdateResult result = mongoTemplate.updateFirst(query, update, UserModal.class);

            if (result.getMatchedCount() > 0) {
                return ResponseEntity.status(HttpStatus.OK).body("Usuário atualizado com sucesso");
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não encontrado para atualização");
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("emaail não encontrato");

    }

    public ResponseEntity<Objects> rank (UserModal userModal, UserRep userRep){

// <MongoCollection setup code here>

        // Cria o critério de ordenação (1 = crescente, -1 = decrescente)

        return null;
    }
}
