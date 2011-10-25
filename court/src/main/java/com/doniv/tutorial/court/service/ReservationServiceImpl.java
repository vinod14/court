package com.doniv.tutorial.court.service;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.doniv.tutorial.court.domain.Player;
import com.doniv.tutorial.court.domain.Reservation;
import com.doniv.tutorial.court.domain.SportType;

public class ReservationServiceImpl implements ReservationService {
	
	public static final SportType TENNIS = new SportType(1,"Tennis");
	public static final SportType SOCCER = new SportType(2,"Soccer");
	
	private List<Reservation> reservations;
	
	public ReservationServiceImpl(){
		reservations = new ArrayList();
		reservations.add(new Reservation("Tennis #1", new GregorianCalendar(2008,0,14).getTime(), 16, new Player("Roger", "N/A"), TENNIS));
		
	}

	public List<Reservation> query(String courtName) {
		// TODO Auto-generated method stub
		
		List<Reservation> result = new ArrayList<Reservation>();
		for (Reservation reservation: reservations){
			if(reservation.getCourtName().equals(courtName)){
				result.add(reservation);
			}
		}
		return result; 
	}
	

}
