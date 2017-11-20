package bullGame.model;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.hateoas.Identifiable;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Макс on 20.11.2017.
 */
@Entity
@Table(name = "user")
public class User implements Identifiable<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user")
    private Long id_user;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "id_user")
    private Set<Game> games = new HashSet<Game>();

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public Long getId() {
        return id_user;
    }
}

