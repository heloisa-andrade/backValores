package com.example.jogoVivi.Controller;

import com.example.jogoVivi.Modal.ValoresModal;
import com.example.jogoVivi.repositori.ValoresRepositry;
import com.example.jogoVivi.service.ValoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Permite apenas esse domínio
public class ValoresController {
    @Autowired
    ValoresRepositry valores;

    @GetMapping("/find/{tipo}")
    public List<ValoresModal> findValores(@PathVariable int tipo){
        ValoresService valoresService = new ValoresService();
        return valoresService.findTipo(tipo, valores);
    }
}
