package apix.accounts.infra.database.repository;

import apix.accounts.infra.database.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
}
