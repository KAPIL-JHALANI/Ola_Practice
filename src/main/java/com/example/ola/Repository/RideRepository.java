package com.example.ola.Repository;

import com.example.ola.Model.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RideRepository extends JpaRepository<Ride,Long> {

    Optional<List<Ride>>findByRiderId(Long id);
}
