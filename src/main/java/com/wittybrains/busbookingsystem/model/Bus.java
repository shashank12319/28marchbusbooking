package com.wittybrains.busbookingsystem.model;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="bus")
public class Bus implements Serializable {
    private static final long serialVersionUID = 1L; 
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name = "number", nullable = false)
	    private String number;
	    
	    @Enumerated(EnumType.STRING)
	    @Column(name = "type", nullable = false)
	    private BusType type;
       
        @CreationTimestamp
        private LocalDateTime createdOn;

        @UpdateTimestamp
        private LocalDateTime updatedOn;
        
        @OneToMany(mappedBy = "bus")
        private List<Conductor> conductors;
        
        @OneToMany
        private List<Passenger> passengers;

		

		public BusType getType() {
			return type;
		}

		public void setType(BusType type) {
			this.type = type;
		}

		public LocalDateTime getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(LocalDateTime createdOn) {
			this.createdOn = createdOn;
		}

		public LocalDateTime getUpdatedOn() {
			return updatedOn;
		}

		public void setUpdatedOn(LocalDateTime updatedOn) {
			this.updatedOn = updatedOn;
		}

		public List<Conductor> getConductors() {
			return conductors;
		}

		public void setConductors(List<Conductor> conductors) {
			this.conductors = conductors;
		}

		public List<Passenger> getPassengers() {
			return passengers;
		}

		public void setPassengers(List<Passenger> passengers) {
			this.passengers = passengers;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getNumber() {
	        return number;
	    }

	    public void setNumber(String number) {
	        this.number = number;
	    }

	    @PrePersist
	     void prePersist() {
	    	 this.createdOn=LocalDateTime.now();
	    	 this.updatedOn=LocalDateTime.now();
	     }
		



	}
