package com.boot.GoPlaces.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.GoPlaces.domain.Place;
import com.boot.GoPlaces.repository.PlaceRepository;
@Service
public class PlaceDbServiceImpl implements PlaceService {
	
	@Autowired
	PlaceRepository placeRepository;

	@Override
	public List<Place> getAllPlaces() {
		return (List<Place>)placeRepository.findAll();
	}

	@Override
	public Place getPlace(String id) {		
		return placeRepository.findOne(id);
	}

	@Override
	public Place addPlace(Place place) {
		return placeRepository.save(place);
	}

	@Override
	public Place updatePlace(Place place) {
		return placeRepository.save(place);
	}

	@Override
	public Place deletePlace(Place place) {
		placeRepository.delete(place.getId());
		return place;
	}

}
