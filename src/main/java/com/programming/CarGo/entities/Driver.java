package com.programming.CarGo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< HEAD
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
=======

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

>>>>>>> c2bf75242966963b7f8122b269b433f1f8f90c40
    private Double rating;

    private Boolean available;

<<<<<<< HEAD
=======
    private String vehicleId;

>>>>>>> c2bf75242966963b7f8122b269b433f1f8f90c40
    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;


}
