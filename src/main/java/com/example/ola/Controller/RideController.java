package com.example.ola.Controller;

import com.example.ola.Payload.RidePayload;
import com.example.ola.Service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RideController {

    @Autowired
    RideService rideService;

    @PostMapping(value = "book_ride",consumes = "application/json",produces = "application/json")
    public ResponseEntity<?>book_ride(@RequestBody RidePayload ridePayload){
        return ResponseEntity.ok(rideService.book_ride(ridePayload));
    }


}
