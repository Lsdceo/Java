package com.CRIME2.demo.controller;

import com.CRIME2.demo.Model;
import com.CRIME2.demo.dto.crimeDTO;
import com.CRIME2.demo.repository.crimeRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crime")

public class controller {

    @Autowired
    crimeRepository repository;

    @GetMapping
    public ResponseEntity getCrime(){
        var get = repository.findAll();
        return ResponseEntity.ok(get);
    }

    @PostMapping
    public ResponseEntity createCrime(@RequestBody @Valid crimeDTO data){

        Model newCrime = new Model(data);
        repository.save(newCrime);
        return ResponseEntity.ok().build();
    }
}
