package ironhack.com.demo.repository;

import ironhack.com.demo.model.Conferences;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferencesRepositories extends JpaRepository<Conferences, Integer> {
}
