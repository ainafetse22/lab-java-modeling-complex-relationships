package ironhack.com.demo.repository;

import ironhack.com.demo.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter,String> {
    Chapter findByName(String Name);
}
