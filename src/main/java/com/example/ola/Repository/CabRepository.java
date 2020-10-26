package com.example.ola.Repository;

import com.example.ola.Model.Cab;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CabRepository extends JpaRepository<Cab,Long> {
    Optional<Cab>findById(Long id);
    List<Cab> findAll();
}
