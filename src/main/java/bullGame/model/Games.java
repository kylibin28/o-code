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

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @ManyToOne()
    @JoinColumn(name = "id_user")
    private Users id_user;

    public Integer getId_game() {
        return id_game;
    }

    public void setId_game(Integer id_game) {
        this.id_game = id_game;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Users getId_user() {
        return id_user;
    }

    public void setId_user(Users id_user) {
        this.id_user = id_user;
    }

    public long lengthOfGame(){
       return endDate.getTime() - startDate.getTime();
    }

    public Games() {
    }

    public Games(Date startDate, Date endDate,Users id_user) {
        this.startDate = startDate;
        this.endDate = endDate;
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
                ", startDate=" + startDate.toString() +
                ", endDate=" + endDate.toString() +
                ", userLogin=" + id_user.getLogin()+
                '}';
    }
}
