package location.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import location.entities.User;



public interface UserRepository extends JpaRepository<User,Integer> {
	
	Optional<User> findByUserName(String userName);

}
