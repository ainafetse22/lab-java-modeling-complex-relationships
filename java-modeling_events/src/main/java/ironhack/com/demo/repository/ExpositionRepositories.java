package ironhack.com.demo.repository;

import ironhack.com.demo.model.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpositionRepositories extends JpaRepository<Exposition,Integer> {
}
