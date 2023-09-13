package ubaid.group.onlinebank.repositories;

import java.util.Optional;

import ubaid.group.onlinebank.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Optional<Role> findByName(String name);

}
