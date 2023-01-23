package ch.bbw.es.m151springjpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Friends {
    @Id
    int friendshipID;

    public int getFriendshipID() {
        return friendshipID;
    }

    public void setFriendshipID(int friendshipID) {
        this.friendshipID = friendshipID;
    }
}
