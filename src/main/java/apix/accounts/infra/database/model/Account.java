package apix.accounts.infra.database.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Document
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    private String id;
    private String document;
    private String number;
    private String agency;
    private AccountType type;
    private BigDecimal balance;
    private BigDecimal available_credit_limit;
    @CreatedDate
    private LocalDate created_at;
    @LastModifiedDate
    private LocalDate updated_at;

    @PersistenceConstructor
    public Account(String number, String agency, AccountType type, String document, BigDecimal balance, BigDecimal available_credit_limit) {
        Assert.notNull(number, "The given number must not be null!");
        Assert.notNull(agency, "The given agency must not be null!");
        Assert.notNull(type, "The given type must not be null!");
        Assert.notNull(balance, "The given balance must not be null!");
        Assert.notNull(available_credit_limit, "The given available_credit_limit must not be null!");
        Assert.notNull(document, "The given customer_document must not be null!");

        this.id = UUID.randomUUID().toString();
        this.number = number;
        this.agency = agency;
        this.type = type;
        this.document = document;
        this.balance = balance;
        this.available_credit_limit = available_credit_limit;
    }
}
