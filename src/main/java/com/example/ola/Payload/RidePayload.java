package com.example.ola.Payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RidePayload {
    Long riderId;
    double initial_x;
    double initial_y;
    double final_x;
    double final_y;
}
