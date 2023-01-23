package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Guild {
    @Id
    int guildID;
    String guild_name;
    int guild_rep;

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
