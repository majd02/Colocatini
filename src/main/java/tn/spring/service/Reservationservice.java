package tn.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.spring.entity.AppUser;
import tn.spring.entity.Logement;
import tn.spring.entity.reservation;
import tn.spring.repository.LogementRepository;
import tn.spring.repository.UserRepository;
import tn.spring.repository.ReservationRepository;

@Service
public class Reservationservice {

	@Autowired
	ReservationRepository vr;
	  @Autowired
		UserRepository userRepository ;
	    @Autowired
	     LogementRepository articleRepository;
	    public void add(reservation v,int ida,Long id) {
	    	
	    	AppUser u= userRepository.findById(id).orElse(null);
	    	Logement a = articleRepository.findById(ida).get();
	    	v.setLogement(a);
	    	v.setUser(u);
	    	vr.save(v);
	    }
	    
}
