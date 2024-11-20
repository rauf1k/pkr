package com.railway.repository;

import com.railway.entity.Ticket;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends ReactiveCrudRepository<Ticket, Long> {
}
