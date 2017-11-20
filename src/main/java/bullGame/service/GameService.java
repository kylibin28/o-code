package bullGame.service;

import bullGame.model.Games;
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

    public List<Games> findAllGames() {
        return gameRepository.findAll();
    }

    public Games saveGame(Games user) {
        return gameRepository.save(user);
    }

    public void deleteGame(Games user) {
        gameRepository.delete(user);
    }

    public Games findGameById(int gameId) {
        return gameRepository.findOne(gameId);
    }
}
