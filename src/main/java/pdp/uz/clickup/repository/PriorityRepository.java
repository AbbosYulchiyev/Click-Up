package pdp.uz.clickup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pdp.uz.clickup.entity.Priority;

public interface PriorityRepository extends JpaRepository<Priority, Long> {
}
