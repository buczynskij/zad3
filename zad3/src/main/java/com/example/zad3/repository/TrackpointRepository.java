package com.example.zad3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.zad3.entity.Trackpoint;

@Repository
public interface TrackpointRepository extends JpaRepository<Trackpoint, Integer> {

}
