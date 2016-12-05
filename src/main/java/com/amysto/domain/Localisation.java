package com.amysto.domain;

import org.springframework.data.annotation.Id;

import com.mongodb.util.JSON;

public class Localisation {
	
    @Id
    private int id;
    
    private JSON coordinate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JSON getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(JSON coordinate) {
		this.coordinate = coordinate;
	}
    
    

}
