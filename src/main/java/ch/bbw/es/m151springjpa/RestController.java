package ch.bbw.es.m151springjpa;

import ch.bbw.es.m151springjpa.model.Friends;
import ch.bbw.es.m151springjpa.model.Guild;
import ch.bbw.es.m151springjpa.repository.FriendsRepository;
import ch.bbw.es.m151springjpa.repository.GuildRepository;
import ch.bbw.es.m151springjpa.repository.PlayerRepository;
import ch.bbw.es.m151springjpa.repository.WeaponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private FriendsRepository friendsRepository;

    @Autowired
    private GuildRepository guildRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private WeaponRepository weaponRepository;

    @PostMapping("/friends")
    public void createFriends(@RequestBody Friends friends) {
        friendsRepository.save(friends);
    }

    @GetMapping("/friends")
    public Iterable<Friends> getFriends() {
        return friendsRepository.findAll();
    }

    @GetMapping("/friends/{id}")
    public Friends getFriendsById(@PathVariable int id) {
        return friendsRepository.findById(id).get();
    }

    @PutMapping("/friends/{id}")
    public void updateFriends(@PathVariable int id, @RequestBody Friends friends) {
        Friends friendsToUpdate = friendsRepository.findById(id).get();
        friendsToUpdate.setPlayer1(friends.getPlayer1());
        friendsToUpdate.setPlayer2(friends.getPlayer2());
        friendsToUpdate.setFriedShipRep(friends.getFriedShipRep());
        friendsRepository.save(friendsToUpdate);
    }

    @DeleteMapping("/friends/{id}")
    public void deleteFriends(@PathVariable int id) {
        friendsRepository.deleteById(id);
    }
}
