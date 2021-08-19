package apix.accounts.domain.schemas;

import apix.accounts.infra.database.model.AccountType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@Validated
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming
public class AccountRequest {

    @NotNull
    private final String document;
    @NotNull
    private final String number;
    @NotNull
    private final String agency;
    @NotNull
    private final AccountType type;
    @NotNull
    private final BigDecimal balance;
    @NotNull
    private final BigDecimal available_credit_limit;

}
