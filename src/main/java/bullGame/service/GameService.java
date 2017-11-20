package bullGame.service;

import bullGame.model.Game;
import bullGame.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Макс on 20.11.2017.
 */
@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<Game> findAllDepartments() {
        return gameRepository.findAll();
    }

    public Game saveDepartment(Game user) {
        return gameRepository.save(user);
    }

    public void deleteDepartment(Game user) {
        gameRepository.delete(user);
    }

    public Game findDepartmentById(long gameId) {
        return gameRepository.findOne(gameId);
    }
}
