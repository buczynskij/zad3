package com.example.zad3.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zad3.entity.Trackpoint;
import com.example.zad3.repository.TrackpointRepository;

@Service
public class GpsService {

	@Autowired
	TrackpointRepository trackpointRepository;

	public void save(Trackpoint trackpoint) {

		trackpoint.setTimestamp(LocalDateTime.now());
		trackpointRepository.save(trackpoint);
	}

}
