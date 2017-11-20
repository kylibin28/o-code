package bullGame.model;

import org.springframework.hateoas.Identifiable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Макс on 20.11.2017.
 */
@Entity
@Table(name = "games")
public class Games implements Identifiable<Integer> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_game")
    private Integer id_game;

    @Column(name = "dateOfGame")
    private Date dateOfGame;

    @Column(name = "attemptsCount")
    private int attemptsCount;

    @ManyToOne()
    @JoinColumn(name = "id_user")
    private Users id_user;

    public Integer getId_game() {
        return id_game;
    }

    public void setId_game(Integer id_game) {
        this.id_game = id_game;
    }

    public Date getDateOfGame() {
        return dateOfGame;
    }

    public void setDateOfGame(Date dateOfGame) {
        this.dateOfGame = dateOfGame;
    }

    public Users getId_user() {
        return id_user;
    }

    public void setId_user(Users id_user) {
        this.id_user = id_user;
    }

    public Games() {
    }

    public Games(Date dateOfGame, int attemptsCount ,Users id_user) {
        this.dateOfGame = dateOfGame;
        this.attemptsCount = attemptsCount;
        this.id_user = id_user;
    }

    @Override
    public Integer getId() {
        return id_game;
    }

    @Override
    public String toString() {
        return "Games{" +
                "id_game=" + id_game +
                ", dateOfGame=" + dateOfGame.toString() +
                ", attemptsCount=" + attemptsCount +
                ", userLogin=" + id_user.getLogin()+
                '}';
    }
}
