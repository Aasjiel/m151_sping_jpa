package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Weapon {
    @Id
    int weaponID;
    String weapon_name;
    String damage;

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
