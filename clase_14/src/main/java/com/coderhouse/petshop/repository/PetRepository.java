package com.coderhouse.petshop.repository;

import com.coderhouse.petshop.entities.PetEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, String> {
}
