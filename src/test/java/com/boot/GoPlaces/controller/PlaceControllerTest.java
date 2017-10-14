package com.boot.GoPlaces.controller;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import com.boot.GoPlaces.MainClass;
import com.boot.GoPlaces.domain.Place;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MainClass.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlaceControllerTest {

    @LocalServerPort
    // The port is initialised with a random value
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();
    // The headers usually contain 
    HttpHeaders headers = new HttpHeaders();

    Place place;

    @Before
    public void setUp() throws Exception {
         place = new Place("1","abc","hyd","url1");
    }
    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAddPlace() throws Exception {

        HttpEntity<Place> entity = new HttpEntity<Place>(place, headers);        
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/hi"),
                HttpMethod.POST, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("Place Added Successfully",actual);
    }

    @Test
    public void testList() throws Exception {
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/hi"),
                HttpMethod.GET, entity, String.class);
        assertNotNull(response);

    }
    @Test
    public void testGetPlace() throws Exception {
    	HttpEntity<Place> entity = new HttpEntity<Place>(place, headers);        
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/hi/1"),
                HttpMethod.GET, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("Place retrieved",actual);
    }
    @Test
    public void testUpdatePlace() throws Exception {
    	HttpEntity<Place> entity = new HttpEntity<Place>(place, headers);        
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/hi/1"),
                HttpMethod.PUT, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("Place modified Successfully",actual);
    }

    @Test
    public void testDeletePlace() throws Exception {
    	HttpEntity<Place> entity = new HttpEntity<Place>(place, headers);        
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/hi/2"),
                HttpMethod.DELETE, entity, String.class);
        assertNotNull(response);
        String actual = response.getBody();
        System.out.println(actual);
        assertEquals("Place Deleted!!",actual);
    }

}
