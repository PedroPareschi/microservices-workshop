package com.pedropareschi.microservicos.currency_exchange_service.repositories;

import com.pedropareschi.microservicos.currency_exchange_service.models.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);

}
