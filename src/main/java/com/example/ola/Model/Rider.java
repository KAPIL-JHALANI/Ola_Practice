package com.example.ola.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Rider {

    @Id
    @GeneratedValue
    Long id;

    String name;
    double rating;

//    @OneToOne
//    @JoinColumn(name = "cab_id")
//    private Cab cab;

    @OneToMany(mappedBy = "rider", fetch = FetchType.LAZY)
    private List<Ride> rides;

}
