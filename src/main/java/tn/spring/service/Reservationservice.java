package tn.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	    public List<reservation> All (){
	    	return vr.findAll();
	    }
	    public List <reservation> mine (Long id ){
	    	AppUser u= userRepository.findById(id).orElse(null);
		    return u.getReservations();
	    }
	    public void accept (Long id) {
	    	reservation r = vr.findById(id).get();
	    	r.setEtat("Accepted");
	    	vr.save(r);
	    }
	    public void decline (Long id) {
	    	reservation r = vr.findById(id).get();
	    	r.setEtat("Rejected");
	    	vr.save(r);
	    }
	   public static int c= 0;
	    public int accnum(Long id) {
	    	 
	    	
	    	AppUser u= userRepository.findById(id).orElse(null);
	    	List<reservation> ress= u.getReservations();

	    	for(reservation r :ress)
	    	{
	    		
	    	if(	r.getEtat().compareTo("Accepted")==1)
	    	{
	    		System.out.print(r.getEtat());
	    		c++;
	    	}
	    		
	    		
	    	}
	    	return c ;
	    }
	    
	    
}
