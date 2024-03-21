package ironhack.com.demo.repository;

import ironhack.com.demo.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepositories extends JpaRepository<Speaker, Integer> {
}
