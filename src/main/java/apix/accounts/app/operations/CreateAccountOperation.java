package apix.accounts.app.operations;

import apix.accounts.app.services.AccountService;
import apix.accounts.domain.mappers.ToModelMapper;
import apix.accounts.domain.mappers.ToResponseMapper;
import apix.accounts.domain.schemas.AccountRequest;
import apix.accounts.domain.schemas.AccountResponse;
import apix.accounts.infra.database.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateAccountOperation {

    private AccountService accountService;
    private ToModelMapper toModelMapper;
    private ToResponseMapper toResponseMapper;

    @Autowired
    public CreateAccountOperation(AccountService accountService, ToModelMapper toModelMapper, ToResponseMapper toResponseMapper) {
        this.accountService = accountService;
        this.toModelMapper = toModelMapper;
        this.toResponseMapper = toResponseMapper;
    }

    public AccountResponse execute(AccountRequest request) {
        Account account = this.accountService.create(toModelMapper.convert(request));
        return toResponseMapper.convert(account);
    }

}
