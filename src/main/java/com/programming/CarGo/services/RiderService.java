package com.programming.CarGo.services;

import com.programming.CarGo.dto.DriverDto;
import com.programming.CarGo.dto.RideDto;
import com.programming.CarGo.dto.RideRequestDto;
import com.programming.CarGo.dto.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId,Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();
}
