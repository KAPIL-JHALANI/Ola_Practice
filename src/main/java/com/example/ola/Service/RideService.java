package com.example.ola.Service;

import com.example.ola.Model.Cab;
import com.example.ola.Model.Ride;
import com.example.ola.Model.Rider;
import com.example.ola.Payload.RidePayload;
import com.example.ola.Repository.CabRepository;
import com.example.ola.Repository.RideRepository;
import com.example.ola.Repository.RiderRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class RideService {

    @Autowired
    RiderRepository riderRepository;

    @Autowired
    CabRepository cabRepository;

    @Autowired
    RideRepository rideRepository;

    public Ride book_ride(RidePayload ridePayload){

        Ride ride=new Ride();
        ride.setFinal_x(ridePayload.getFinal_x());
        ride.setFinal_y(ridePayload.getFinal_y());
        ride.setInitial_x(ridePayload.getInitial_x());
        ride.setInitial_y(ridePayload.getInitial_y());

        List<Cab> cabs=cabRepository.findAll();

        double min=Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<cabs.size();i++){
            double ans=Math.sqrt(Math.pow(cabs.get(i).getLatitude()-ridePayload.getInitial_x(),2)+Math.pow(cabs.get(i).getLongitude()-ridePayload.getInitial_y(),2));
            if(ans<min){
                min=ans;
                j=i;
            }
        }

        log.info("Cab Name ----------------------------------------------------------->",cabs.get(j).getName());
        ride.setCab(cabs.get(j));

        log.info("Cab Name ----------------------------------------------------------->",ridePayload.getRiderId());
        Rider rider=riderRepository.findById(ridePayload.getRiderId())
                .orElseThrow(()->new RuntimeException());
        log.info("Cab Name ----------------------------------------------------------->",rider.getId());

        ride.setRider(rider);
        rideRepository.save(ride);

        return ride;
    }


}
