package io.github.thoncoder.encurtador_de_link.services;

import io.github.thoncoder.encurtador_de_link.entities.LinkEntity;
import io.github.thoncoder.encurtador_de_link.repositories.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class LinkService {

    @Autowired
    private LinkRepository repository;

    public Optional<LinkEntity> getByCode (String code) {
        return repository.findByCode(code);
    }

    public void criar (LinkEntity entity) {
        entity.setCode(generateCode());
        repository.save(entity);
    }

    public void addVisita (LinkEntity link) {
        link.setVisitas(link.getVisitas()+1);
        repository.save(link);
    }

    public String generateCode () {
        return UUID.randomUUID().toString().substring(0, 5);
    }

}
