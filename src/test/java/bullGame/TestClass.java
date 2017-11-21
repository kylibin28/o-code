package bullGame;

import bullGame.model.Games;
import bullGame.model.Users;
import bullGame.service.GameService;
import bullGame.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by Макс on 20.11.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestClass {

    @Autowired
    private GameService gameService;

    @Autowired
    private UserService userService;

    @Test
    public void add() {
        userService.saveUser(new Users("1", "1", "Max", "Aver"));
//        userService.saveUser(new Users("2", "2"));
//        gameService.saveGame(new Games(new Date(), 4, userService.findUserById(1)));
//        gameService.saveGame(new Games(new Date(), 5, userService.findUserById(1)));
        gameService.saveGame(new Games(new Date(), 3, userService.findUserById(1)));
        gameService.saveGame(new Games(new Date(), 2, userService.findUserById(1)));
        gameService.saveGame(new Games(new Date(), 1, userService.findUserById(1)));

    }

    @Test
    public void selectAll() {
        List<Users> usersList = userService.findAllUsers();
        for (Users user : usersList) {
            System.out.println(user.toString());
        }

        List<Games> gamesList = gameService.findAllGames();
        for (Games game : gamesList) {
            System.out.println(game.toString());
        }
    }
}
