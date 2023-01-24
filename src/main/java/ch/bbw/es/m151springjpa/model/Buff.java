package ch.bbw.es.m151springjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "buff")
@NamedQuery(name = "Buff.findAll", query = "FROM Buff")
public class Buff {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int buffID;

    @Column(name = "buff_name")
    String buff_name;

    @Column(name = "buff_level")
    int buff_level;

    @ManyToMany(mappedBy = "buffs")
    @JsonIgnore
    List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getBuffID() {
        return buffID;
    }

    public void setBuffID(int buffID) {
        this.buffID = buffID;
    }

    public String getBuff_name() {
        return buff_name;
    }

    public void setBuff_name(String buff_name) {
        this.buff_name = buff_name;
    }

    public int getBuff_level() {
        return buff_level;
    }

    public void setBuff_level(int buff_level) {
        this.buff_level = buff_level;
    }
}
