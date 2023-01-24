package ch.bbw.es.m151springjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "guild")
@NamedQuery(name = "Guild.findAll", query = "FROM Guild")
public class Guild {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int guildID;
    @Column(name = "guild_name")
    String guild_name;
    @Column(name = "guild_rep")
    int guild_rep;

    @OneToMany(mappedBy = "guild")
    @JsonIgnore
    List<Player> players;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getGuildID() {
        return guildID;
    }

    public void setGuildID(int guildID) {
        this.guildID = guildID;
    }

    public String getGuild_name() {
        return guild_name;
    }

    public void setGuild_name(String guild_name) {
        this.guild_name = guild_name;
    }

    public int getGuild_rep() {
        return guild_rep;
    }

    public void setGuild_rep(int guild_rep) {
        this.guild_rep = guild_rep;
    }
}
