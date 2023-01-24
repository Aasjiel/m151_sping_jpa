package ch.bbw.es.m151springjpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "weapon")
@NamedQuery(name = "Weapon.findAll", query = "FROM Weapon")
public class Weapon {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int weaponID;
    @Column(name = "weapon_name")
    String weapon_name;
    @Column(name = "damage")
    String damage;

    @OneToOne(mappedBy = "weapon")
    @JsonIgnore
    Player player;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getWeaponID() {
        return weaponID;
    }

    public void setWeaponID(int weaponID) {
        this.weaponID = weaponID;
    }

    public String getWeapon_name() {
        return weapon_name;
    }

    public void setWeapon_name(String weapon_name) {
        this.weapon_name = weapon_name;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }
}
