package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @OneToOne
    @JoinColumn(name="clientId", nullable=false)
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(Client client) {
        this.client = client;
    }

    // getters and setters...
}
