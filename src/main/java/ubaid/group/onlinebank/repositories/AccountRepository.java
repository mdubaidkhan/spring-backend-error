package ubaid.group.onlinebank.repositories;

import ubaid.group.onlinebank.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
