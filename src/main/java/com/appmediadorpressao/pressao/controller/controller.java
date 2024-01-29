package com.appmediadorpressao.pressao.controller;

import com.appmediadorpressao.pressao.entity.Bloodentity;
import com.appmediadorpressao.pressao.services.Services;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Blood")
public class controller {

    private  final Services services;

    public controller(Services services) {
        this.services = services;
    }
@GetMapping
    public List<Bloodentity> findAllBloodpressure(){
        return  services.findAllBloodpressure();
    };
@GetMapping("/{id}")
    public Optional<Bloodentity> findBloodpressureById(@PathVariable("id") Long id){
    return  services.findBloodpressureById(id);
};
@PostMapping
public  Bloodentity  saveBloodpressure(@RequestBody Bloodentity pressaoAterial){
    return   services.saveBloodpressure(pressaoAterial);
}

@PutMapping
 public  Bloodentity updateBloodpressure(@RequestBody Bloodentity pressaoAterial){
    return  services.updateBloodpressure(pressaoAterial);
 }
@DeleteMapping
 public  void deleteBloodpressure(@PathVariable("id") Long id){
    services.deleteBloodpressure(id);
 }
}
