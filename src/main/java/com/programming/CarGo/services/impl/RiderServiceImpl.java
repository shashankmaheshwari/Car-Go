package com.programming.CarGo.services.impl;

import com.programming.CarGo.dto.DriverDto;
import com.programming.CarGo.dto.RideDto;
import com.programming.CarGo.dto.RideRequestDto;
import com.programming.CarGo.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
