package apix.accounts.interfaces.http.account;

import apix.accounts.app.operations.CreateAccountOperation;
import apix.accounts.domain.schemas.AccountRequest;
import apix.accounts.domain.schemas.AccountResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final CreateAccountOperation createAccountOperation;

    @Autowired
    public AccountController(CreateAccountOperation createAccountOperation) {
        this.createAccountOperation = createAccountOperation;
    }

    @PostMapping
    public ResponseEntity<AccountResponse> create(@RequestBody AccountRequest request) {
        AccountResponse response = createAccountOperation.execute(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
