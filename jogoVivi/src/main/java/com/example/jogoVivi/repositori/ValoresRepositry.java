package com.example.jogoVivi.repositori;

import com.example.jogoVivi.Modal.ValoresModal;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ValoresRepositry extends MongoRepository<ValoresModal,String> {
    List<ValoresModal> findByTipo(int tipo);
}
