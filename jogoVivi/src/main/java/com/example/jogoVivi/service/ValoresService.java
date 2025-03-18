package com.example.jogoVivi.service;

import com.example.jogoVivi.Modal.ValoresModal;
import com.example.jogoVivi.repositori.ValoresRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValoresService {

    public List<ValoresModal> findTipo(int tipo, ValoresRepositry valoresRepositry){
        return valoresRepositry.findByTipo(tipo);
    }
}
