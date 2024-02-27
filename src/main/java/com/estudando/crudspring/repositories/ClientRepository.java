package com.estudando.crudspring.repositories;

import com.estudando.crudspring.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
