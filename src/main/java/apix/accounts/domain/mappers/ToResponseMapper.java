package apix.accounts.domain.mappers;

import apix.accounts.domain.schemas.AccountResponse;
import apix.accounts.infra.database.model.Account;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ToResponseMapper implements Converter<Account, AccountResponse> {
    @Override
    public AccountResponse convert(Account account) {
        return AccountResponse.builder()
                .document(account.getDocument())
                .id(account.getId())
                .agency(account.getAgency())
                .balance(account.getBalance())
                .available_credit_limit(account.getAvailable_credit_limit())
                .type(account.getType())
                .created_at(account.getCreated_at())
                .updated_at(account.getUpdated_at())
                .build();
    }
}
