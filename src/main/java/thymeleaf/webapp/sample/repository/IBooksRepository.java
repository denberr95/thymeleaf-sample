package thymeleaf.webapp.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import thymeleaf.webapp.sample.model.db.BooksEntity;

public interface IBooksRepository extends JpaRepository<BooksEntity, Long> {

}
