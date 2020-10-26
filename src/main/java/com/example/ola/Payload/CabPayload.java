package com.example.ola.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CabPayload {
    Long id;
    String name;
    String taxinumber;
    double longitude;
    double latitude;
    double rating;
    boolean availability;
}
