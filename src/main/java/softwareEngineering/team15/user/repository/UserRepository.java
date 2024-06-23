package softwareEngineering.team15.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softwareEngineering.team15.user.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
