package com.boot.GoPlaces.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.GoPlaces.domain.Place;

//A marker Interface to implement all the default methods from CRUD REpository
public interface PlaceRepository extends CrudRepository<Place, String>{

}
