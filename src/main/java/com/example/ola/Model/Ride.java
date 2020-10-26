package com.example.ola.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Ride {

    @Id
    @GeneratedValue
    Long id;

    double initial_x;
    double initial_y;
    double final_x;
    double final_y;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cab_id")
    private Cab cab;
//
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rider_id")
    private Rider rider;
}
