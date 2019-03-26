package com.dmslob.business.reservation.client;

import com.dmslob.business.reservation.domain.Reservation;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("RESERVATIONSERVICE")
public interface ReservationService {

    @RequestMapping(value = "/reservations", method = RequestMethod.GET)
    List<Reservation> findAll(@RequestParam(name = "date", required = false) String date);
}