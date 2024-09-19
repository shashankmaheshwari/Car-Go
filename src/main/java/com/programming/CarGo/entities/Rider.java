package com.programming.CarGo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Rider {

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

}
