package ch.bbw.es.m151springjpa;

import ch.bbw.es.m151springjpa.model.*;
import ch.bbw.es.m151springjpa.repository.*;
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

    @Autowired
    private BuffRepository buffRepository;

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

    @PostMapping("/player")
    public void createPlayer(@RequestBody Player player) {
        playerRepository.save(player);
    }

    @GetMapping("/player")
    public Iterable<Player> getPlayer() {
        return playerRepository.findAll();
    }

    @GetMapping("/player/{id}")
    public Player getPlayerById(@PathVariable int id) {
        return playerRepository.findById(id).get();
    }

    @PutMapping("/player/{id}")
    public void updatePlayer(@PathVariable int id, @RequestBody Player player) {
        Player playerToUpdate = playerRepository.findById(id).get();
        playerToUpdate.setPlayer_name(player.getPlayer_name());
        playerToUpdate.setLevel(player.getLevel());
        playerRepository.save(playerToUpdate);
    }

    @DeleteMapping("/player/{id}")
    public void deletePlayer(@PathVariable int id) {
        playerRepository.deleteById(id);
    }

    
}
