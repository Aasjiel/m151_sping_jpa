package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Player {
    @Id
    int playerID;
    String player_name;
    int level;

    @OneToMany(mappedBy = "player1")
    List<Friends> friendsList;


    public int getPlayerid() {
        return playerID;
    }

    public void setPlayerid(int playerid) {
        this.playerID = playerid;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
