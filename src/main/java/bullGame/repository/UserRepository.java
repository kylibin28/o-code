package bullGame.repository;

import bullGame.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Макс on 20.11.2017.
 */
@Repository
public interface UserRepository  extends JpaRepository<Users, Integer> {
}
