package com.railway.handler;

import com.railway.entity.Ticket;
import com.railway.repository.TicketRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TicketHandler {
    private final TicketRepository ticketRepository;

    public TicketHandler(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Mono<ServerResponse> getAllTickets(ServerRequest request) {
        return ServerResponse.ok().body(ticketRepository.findAll(), Ticket.class);
    }

    public Mono<ServerResponse> addTicket(ServerRequest request) {
        return request.bodyToMono(Ticket.class)
                .flatMap(ticketRepository::save)
                .flatMap(savedTicket -> ServerResponse.ok().bodyValue(savedTicket));
    }
}
