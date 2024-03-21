package ironhack.com.demo.repository;

import ironhack.com.demo.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepositories extends JpaRepository<Guest, Integer> {
}
