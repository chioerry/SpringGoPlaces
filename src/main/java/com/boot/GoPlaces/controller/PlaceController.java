package com.boot.GoPlaces.controller;
//Import all the required Packages
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.boot.GoPlaces.domain.Place;
import com.boot.GoPlaces.service.PlaceService;

@RestController
@RequestMapping("/hi")
//The Rest Controller Annotation takes care of mapping requests with methods
public class PlaceController {
	@Autowired
	// Adding the dependecies through Autowired annotation from Interface
	
	private PlaceService placeService;
	
	// This Annotation takes care to map specific response to a method with fixed value attribute
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Place>> getAllPlaces() {
		List<Place> p= placeService.getAllPlaces();
		 return ResponseEntity.ok(p);
		 // ResponseEntity returns List along with HTTP Status.
	}
	
	// This Annotation takes care to map specific response to a method with fixed value attribute
	@RequestMapping(method=RequestMethod.GET,value="/hi/{id}")
	public ResponseEntity<String> getPlace(@PathVariable String id) {
		 placeService.getPlace(id);
		// ResponseEntity returns message along with HTTP Status.
		return ResponseEntity.ok("Place retrieved");
	}
	
	// This Annotation takes care to map specific response to a method with fixed value attribute
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> addPlace(@RequestBody Place place) {
		placeService.addPlace(place);
		// ResponseEntity returns message along with HTTP Status.
		return ResponseEntity.ok("Place Added Successfully");
	}
	
	// This Annotation takes care to map specific response to a method with fixed value attribute
	@RequestMapping(method=RequestMethod.PUT)
	// RequestBody will send entire place object from url to parameter
	public ResponseEntity<String> updatePlace(@RequestBody Place place) {
		placeService.updatePlace(place);
		// ResponseEntity returns message along with HTTP Status.
		return ResponseEntity.ok("Place modified Successfully");
	}
	
	// This Annotation takes care to map specific response to a method with fixed value attribute
	@RequestMapping(method=RequestMethod.DELETE)
	public ResponseEntity<String> deletePlace(@RequestBody Place place) {
		 placeService.deletePlace(place);
		// ResponseEntity returns message along with HTTP Status.
		 return ResponseEntity.ok("Place Deleted!!");
	}
}
