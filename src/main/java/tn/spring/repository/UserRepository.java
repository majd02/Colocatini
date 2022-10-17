package tn.spring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.spring.entity.AppUser;

import org.springframework.stereotype.Repository;

@Transactional(readOnly = true )
@Repository
public interface UserRepository extends JpaRepository<AppUser, Long> {

	 
}
