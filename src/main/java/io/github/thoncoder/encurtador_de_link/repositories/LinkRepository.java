package io.github.thoncoder.encurtador_de_link.repositories;

import io.github.thoncoder.encurtador_de_link.entities.LinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends JpaRepository<LinkEntity, Long> {
    Optional<LinkEntity> findByCode (String code);
}
