package com.railway.repository;

import com.railway.entity.Passenger;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends ReactiveCrudRepository<Passenger, Long> {
}
