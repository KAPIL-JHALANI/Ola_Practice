package com.example.ola.Service;

import com.example.ola.Model.Cab;
import com.example.ola.Payload.CabPayload;
import com.example.ola.Repository.CabRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class CabService {

    @Autowired
    CabRepository cabRepository;

    public Cab register_cab(CabPayload payload){
        Cab cab=new Cab();
        cab.setId(payload.getId());
        cab.setName(payload.getName());
        cab.setRating(payload.getRating());
        cab.setTaxinumber(payload.getTaxinumber());
        cab.setAvailability(payload.isAvailability());
        cab.setLatitude(payload.getLatitude());
        cab.setLongitude(payload.getLongitude());

        cabRepository.save(cab);
        return cab;
    }

    public Cab update_cab(Long id){
        Cab cab=cabRepository.findById(id).orElseThrow(()->new RuntimeException());
        cab.setLongitude(cab.getLongitude()+2);
        cab.setLatitude(cab.getLatitude()+2);

        cabRepository.save(cab);
        return cab;
    }

    public Cab change_availability(Long id){
        Cab cab=cabRepository.findById(id).orElseThrow(()->new RuntimeException());
        cab.setAvailability(!cab.isAvailability());

        cabRepository.save(cab);
        return cab;
    }
}
