package apix.accounts.domain.mappers;

import apix.accounts.domain.schemas.AccountRequest;
import apix.accounts.infra.database.model.Account;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ToModelMapper implements Converter<AccountRequest, Account> {
    @Override
    public Account convert(AccountRequest request) {
        return Account.builder()
                .document(request.getDocument())
                .number(request.getNumber())
                .agency(request.getAgency())
                .type(request.getType())
                .balance(request.getBalance())
                .available_credit_limit(request.getAvailable_credit_limit())
                .build();
    }
}
