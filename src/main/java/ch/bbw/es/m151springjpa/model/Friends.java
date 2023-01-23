package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.*;

@Entity
public class Friends {
    @Id
    int friendshipID;

    int friedShipRep;

    @ManyToOne
    @JoinColumn(name = "player1")
    Player player1;

    @ManyToOne
    @JoinColumn(name = "player2")
    Player player2;


    public int getFriendshipID() {
        return friendshipID;
    }

    public void setFriendshipID(int friendshipID) {
        this.friendshipID = friendshipID;
    }

    public int getFriedShipRep() {
        return friedShipRep;
    }

    public void setFriedShipRep(int friedShipRep) {
        this.friedShipRep = friedShipRep;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }
}
