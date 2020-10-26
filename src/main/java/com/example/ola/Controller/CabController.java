package com.example.ola.Controller;

import com.example.ola.Payload.CabPayload;
import com.example.ola.Service.CabService;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
public class CabController {

    @Autowired
    CabService cabService;

    @PostMapping(value = "/register_cab",consumes = "application/json",produces = "application/json")
    public ResponseEntity<?>register_cab(@RequestBody CabPayload cabPayload){

        return ResponseEntity.ok(cabService.register_cab(cabPayload));
    }

    @PutMapping(value = "update_location",consumes = "application/json",produces = "application/json")
    public ResponseEntity<?>update_location(@RequestBody Long id){
        return ResponseEntity.ok(cabService.update_cab(id));
    }

    @PutMapping(value = "/change_availability",consumes = "application/json",produces = "application/json")
    public ResponseEntity<?>change_availability(@RequestBody Long id){
        return ResponseEntity.ok(cabService.change_availability(id));
    }

}
