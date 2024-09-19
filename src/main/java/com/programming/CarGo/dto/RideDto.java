package com.programming.CarGo.dto;

import com.programming.CarGo.entities.Driver;
import com.programming.CarGo.entities.Rider;
import com.programming.CarGo.entities.enums.PaymentMethod;
import com.programming.CarGo.entities.enums.RideStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {

    private Long id;

    private Point pickupLocation;


    private Point dropOffLocation;


    private LocalDateTime createdTime;

    private RiderDto rider;

    private DriverDto driver;

    private PaymentMethod paymentMethod;

    private RideStatus rideStatus;

    private String otp;

    private Double fare;

    private LocalDateTime startedAt;

    private LocalDateTime endedAt;
}
