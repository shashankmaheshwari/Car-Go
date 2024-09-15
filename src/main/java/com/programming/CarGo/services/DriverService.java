package com.programming.CarGo.services;

import com.programming.CarGo.dto.DriverDto;
import com.programming.CarGo.dto.RideDto;
import com.programming.CarGo.dto.RiderDto;

import java.util.List;

public interface DriverService {

    RiderDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RiderDto endRide(Long rideId);

    RiderDto rateRider(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();



}
