package apix.accounts.domain.schemas;

import apix.accounts.infra.database.model.AccountType;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class AccountResponse {

    private final String id;
    private final String document;
    private final String number;
    private final String agency;
    private final AccountType type;
    private final BigDecimal balance;
    private final BigDecimal available_credit_limit;
    private final LocalDate created_at;
    private final LocalDate updated_at;

}
