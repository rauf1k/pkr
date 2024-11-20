package com.railway.repository;

import com.railway.entity.Admin;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends ReactiveCrudRepository<Admin, Long> {
}
