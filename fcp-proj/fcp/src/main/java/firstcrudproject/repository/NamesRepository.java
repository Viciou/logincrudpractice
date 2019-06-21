package firstcrudproject.repository;


import firstcrudproject.model.Names;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NamesRepository extends JpaRepository<Names, Long> {

}
