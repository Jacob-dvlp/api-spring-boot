package com.appmediadorpressao.pressao.services.impl;

import com.appmediadorpressao.pressao.entity.Bloodentity;
import com.appmediadorpressao.pressao.repository.Repository;
import com.appmediadorpressao.pressao.services.Services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceImplement implements Services {

    private  final Repository repository;

    public ServiceImplement(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<Bloodentity> findAllBloodpressure() {
        return repository.findAll();
    }

    @Override
    public Optional<Bloodentity> findBloodpressureById(long id) {
        return repository.findById(id);
    }

    @Override
    public Bloodentity saveBloodpressure(Bloodentity pressaoAterial) {
        return repository.save(pressaoAterial);
    }

    @Override
    public Bloodentity updateBloodpressure(Bloodentity pressaoAterial) {
        return repository.save(pressaoAterial);
    }

    @Override
    public void deleteBloodpressure(Long id) {
     repository.deleteById(id);
    }
}
