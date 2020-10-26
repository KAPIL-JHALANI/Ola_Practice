package com.example.ola.Repository;

import com.example.ola.Model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RiderRepository extends JpaRepository<Rider,Long> {
    Optional<Rider>findById(Long id);
}
