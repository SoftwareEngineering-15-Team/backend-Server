package softwareEngineering.team15.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softwareEngineering.team15.user.model.UserStatuses;

@Repository
public interface UserStatusRepository extends JpaRepository<UserStatuses, Long> {
}
