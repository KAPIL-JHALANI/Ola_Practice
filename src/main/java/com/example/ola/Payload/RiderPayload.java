package com.example.ola.Payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RiderPayload {
    Long id;
    String name;
    double rating;
}
