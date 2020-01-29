package com.example.zad3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.zad3.entity.Trackpoint;
import com.example.zad3.service.GpsService;

@RestController
public class GpsController {

	@Autowired
	GpsService gpsService;

	@PostMapping(value = "/trackpoints")
	public Trackpoint newTrackpoint(@RequestBody Trackpoint trackpoint) {
		return gpsService.save(trackpoint);
	}

}
