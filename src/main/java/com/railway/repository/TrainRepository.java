package com.railway.repository;

import com.railway.entity.Train;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends ReactiveCrudRepository<Train, Long> {
}
