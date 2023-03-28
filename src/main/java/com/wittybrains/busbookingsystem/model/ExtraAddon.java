package com.wittybrains.busbookingsystem.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ExtraAddon implements Serializable {
    private static final long serialVersionUID = 1L;

	    private String name;
	    private int quantity;

	    public ExtraAddon() {}

	    public ExtraAddon(String name, int quantity) {
	        this.name = name;
	        this.quantity = quantity;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

    
}