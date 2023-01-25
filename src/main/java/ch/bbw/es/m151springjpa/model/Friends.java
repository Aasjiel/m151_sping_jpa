package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "friedns")
@NamedQuery(name = "Friends.findAll", query = "FROM Friends")
public class Friends {
    @Id
    @Column(name = "id", unique = true)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int friendshipID;
    @Column(name = "friendship_rep")
    int friedShipRep;


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
    
}
