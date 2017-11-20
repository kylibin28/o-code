package bullGame.model;

import org.springframework.hateoas.Identifiable;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Макс on 20.11.2017.
 */
@Entity
@Table(name = "game")
public class Game implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_game")
    private Long id_game;

    @Column(name = "startDate")
    private Long startDate;

    @Column(name = "endDate")
    private Long endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User id_user;

    public Game() {
    }

    public Game(Long startDate, Long endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public Long getId() {
        return id_game;
    }
}
