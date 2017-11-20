package bullGame.repository;

import bullGame.model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Макс on 20.11.2017.
 */

@Repository
public interface GameRepository extends JpaRepository<Games, Integer> {

    @Query(value = "select * from games g where g.id_user = :id_user", nativeQuery = true)
    List<Games> findUsersGames(@Param("id_user") int id_user);


}
