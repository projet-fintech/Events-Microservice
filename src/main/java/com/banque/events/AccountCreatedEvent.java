package com.banque.events;

import java.util.UUID;

public class AccountCreatedEvent {
    private UUID accountId;
    private UUID clientId;
    private String accountNumber;

    public AccountCreatedEvent(UUID accountId, UUID clientId, String accountNumber) {
        this.accountId = accountId;
        this.clientId = clientId;
        this.accountNumber = accountNumber;
    }

    public AccountCreatedEvent() {
    }

    public UUID getAccountId() {
        return accountId;
    }

    public void setAccountId(UUID accountId) {
        this.accountId = accountId;
    }

    public UUID getClientId() {
        return clientId;
    }

    public void setClientId(UUID clientId) {
        this.clientId = clientId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
