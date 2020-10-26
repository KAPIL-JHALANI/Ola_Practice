package com.example.ola.Controller;

import com.example.ola.Payload.RiderPayload;
import com.example.ola.Service.RiderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RiderController {

    @Autowired
    RiderService riderService;


    @PostMapping(value = "/register_rider",consumes = "application/json",produces = "application/json")
    public ResponseEntity<?>register_rider(@RequestBody RiderPayload riderPayload){

        return ResponseEntity.ok(riderService.register_rider(riderPayload));
    }

    @GetMapping("/fetch_rides")
    public ResponseEntity<?>fetch_rides(@RequestBody Long id){
        return ResponseEntity.ok(riderService.fetch_rider(id));
    }






}
