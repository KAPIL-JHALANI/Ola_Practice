package com.example.ola.Service;

import com.example.ola.Model.Ride;
import com.example.ola.Model.Rider;
import com.example.ola.Payload.RiderPayload;
import com.example.ola.Repository.RideRepository;
import com.example.ola.Repository.RiderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Payload;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class RiderService {
    @Autowired
    RiderRepository riderRepository;

    @Autowired
    RideRepository rideRepository;

    public Rider register_rider(RiderPayload riderPayload){
      Rider rider=new Rider();
      rider.setId(riderPayload.getId());
      rider.setName(riderPayload.getName());
      rider.setRating(riderPayload.getRating());

      riderRepository.save(rider);
      return rider;
    }

    public List<Ride> fetch_rider(Long id){

        List<Ride>rides=rideRepository.findByRiderId(id).orElseThrow(()->new RuntimeException());
        return rides;


    }
}
