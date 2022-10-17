package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.Logement;
import tn.spring.entity.reservation;
@Repository
public interface ReservationRepository extends JpaRepository<reservation, Long>{

}
