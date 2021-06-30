package sns.snsproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sns.snsproject.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);
}
