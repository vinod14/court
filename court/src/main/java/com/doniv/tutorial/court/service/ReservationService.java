package com.doniv.tutorial.court.service;

import java.util.List;

import com.doniv.tutorial.court.domain.Reservation;

public interface ReservationService {
	
	public List<Reservation> query(String courtName); 

}
