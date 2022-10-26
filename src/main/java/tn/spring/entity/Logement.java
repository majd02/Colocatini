package tn.spring.entity;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Logement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;
    private String title;
    private String place;
    private String image;
   
    private int nbplace;
    private int prix;
    @DateTimeFormat(pattern = "dd-mm-yyyy") 
    private String date;
    
    @JsonIgnore
    @Transient
    @OneToMany (mappedBy = "logement")
	public List<reservation> reservations;



}
