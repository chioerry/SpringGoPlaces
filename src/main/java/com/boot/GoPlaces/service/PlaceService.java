package com.boot.GoPlaces.service;

import java.util.List;

import com.boot.GoPlaces.domain.Place;

public interface PlaceService {
	public List<Place> getAllPlaces();
	public Place getPlace(String id);
	public Place addPlace(Place place);
	public Place updatePlace(Place place);
	public Place deletePlace(Place place);
}
