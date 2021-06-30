package sns.snsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sns.snsproject.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer> {

}
