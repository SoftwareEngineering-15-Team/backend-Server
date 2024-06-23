package softwareEngineering.team15.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softwareEngineering.team15.info.model.Information;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {
}
