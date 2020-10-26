package com.example.ola.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cab {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String taxinumber;
    private double rating;
    private double longitude;
    private double latitude;

    private boolean availability;

//    @OneToOne(mappedBy = "cab")
//    private Rider rider;
//
    @OneToMany(mappedBy = "cab", fetch = FetchType.LAZY)
    private List<Ride>ride;
}
