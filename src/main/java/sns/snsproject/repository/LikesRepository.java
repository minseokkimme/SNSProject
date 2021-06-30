package sns.snsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sns.snsproject.model.Likes;

public interface LikesRepository extends JpaRepository<Likes, Integer> {
    Likes findByUserIdAndImageId(int userId, int imageId);
}
