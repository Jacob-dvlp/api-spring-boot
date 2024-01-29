package com.appmediadorpressao.pressao.services;

import com.appmediadorpressao.pressao.entity.Bloodentity;

import java.util.List;
import java.util.Optional;

public interface Services {
    List<Bloodentity> findAllBloodpressure();
    Optional<Bloodentity> findBloodpressureById(long id);
    Bloodentity saveBloodpressure(Bloodentity pressaoAterial);
    Bloodentity updateBloodpressure(Bloodentity pressaoAterial);
    void deleteBloodpressure(Long id);


}
