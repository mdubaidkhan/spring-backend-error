package ubaid.group.onlinebank.repositories;

import ubaid.group.onlinebank.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
