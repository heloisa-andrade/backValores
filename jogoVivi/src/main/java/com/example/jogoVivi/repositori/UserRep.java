package com.example.jogoVivi.repositori;

import com.example.jogoVivi.Modal.UserModal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRep extends MongoRepository<UserModal,String> {
}

