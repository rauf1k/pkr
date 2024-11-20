package com.railway.router;

import com.railway.handler.TicketHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TicketRouter {
    @Bean
    public RouterFunction<ServerResponse> ticketRoutes(TicketHandler ticketHandler) {
        return route(GET("/tickets"), ticketHandler::getAllTickets)
                .andRoute(POST("/tickets"), ticketHandler::addTicket);
    }
}
