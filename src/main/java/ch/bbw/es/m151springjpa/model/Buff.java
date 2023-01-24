package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Buff {
    @Id
    int buffID;

    String buff_name;

    int buff_level;

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
