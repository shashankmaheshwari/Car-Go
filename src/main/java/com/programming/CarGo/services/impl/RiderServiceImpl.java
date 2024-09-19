package com.programming.CarGo.services.impl;

import com.programming.CarGo.dto.DriverDto;
import com.programming.CarGo.dto.RideDto;
import com.programming.CarGo.dto.RideRequestDto;
import com.programming.CarGo.entities.RideRequest;
import com.programming.CarGo.services.RiderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
   // private final RideFareCalculationStrategy rideFareCalculationStrategy;
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest=modelMapper.map(rideRequestDto,RideRequest.class);
        log.info("Ride Rquest"+rideRequest.toString());
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
