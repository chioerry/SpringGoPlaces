package com.boot.GoPlaces.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.GoPlaces.domain.Place;

//@Service
//This is a special Annotation where spring initialises as a service class
public class PlaceServiceImpl implements PlaceService{
	// Just a hard-coded List of Places DATA.
	private List<Place> places = new ArrayList<>(Arrays.asList(new Place("1","abc","hyd","url1"), 
			new Place("2","bcd", "bng", "url2"), 
			new Place("3","cde", "chn", "url3"),
			new Place("4","def", "knl", "url4")
			));
	// To get a list of Places
	public List<Place> getAllPlaces(){
		return places;
	}
	
	@Override
	// To get a place
	public Place getPlace(String id) {
		return places.stream().filter(p -> p.getId().equals(id)).findFirst().get();
	}
	@Override
	// This method adds a place
	public Place addPlace(Place place) {
		places.add(place);
		return place;
	}
	@Override
	// This method updates place using id and place object
	public Place updatePlace(Place place) {
		for (int i = 0; i < places.size(); i++) {
//			Place p = places.get(i);
//			if(p.getId().equals(id))
//			{
//				places.set(i, place);
//								
//			}
		}
		return place;
	}
	@Override
	// To delete a place
	public Place deletePlace(Place place) {
		places.removeIf(t -> t.getId().equals(place.getId()));
		return null;
	}

}