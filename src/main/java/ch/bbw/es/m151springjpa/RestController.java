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
        playerToUpdate.setGuild(player.getGuild());
        playerToUpdate.setBuffs(player.getBuffs());
        playerToUpdate.setWeapon(player.getWeapon());
        playerRepository.save(playerToUpdate);
    }

    @DeleteMapping("/player/{id}")
    public void deletePlayer(@PathVariable int id) {
        playerRepository.deleteById(id);
    }

    @PostMapping("/guild")
    public void createGuild(@RequestBody Guild guild) {
        guildRepository.save(guild);
    }

    @GetMapping("/guild")
    public Iterable<Guild> getGuild() {
        return guildRepository.findAll();
    }

    @GetMapping("/guild/{id}")
    public Guild getGuildById(@PathVariable int id) {
        return guildRepository.findById(id).get();
    }

    @PutMapping("/guild/{id}")
    public void updateGuild(@PathVariable int id, @RequestBody Guild guild) {
        Guild guildToUpdate = guildRepository.findById(id).get();
        guildToUpdate.setGuild_name(guild.getGuild_name());
        guildToUpdate.setGuild_rep(guild.getGuild_rep());
        guildRepository.save(guildToUpdate);
    }

    @DeleteMapping("/guild/{id}")
    public void deleteGuild(@PathVariable int id) {
        guildRepository.deleteById(id);
    }

    @PostMapping("/weapon")
    public void createWeapon(@RequestBody Weapon weapon) {
        weaponRepository.save(weapon);
    }

    @GetMapping("/weapon")
    public Iterable<Weapon> getWeapon() {
        return weaponRepository.findAll();
    }

    @GetMapping("/weapon/{id}")
    public Weapon getWeaponById(@PathVariable int id) {
        return weaponRepository.findById(id).get();
    }

    @PutMapping("/weapon/{id}")
    public void updateWeapon(@PathVariable int id, @RequestBody Weapon weapon) {
        Weapon weaponToUpdate = weaponRepository.findById(id).get();
        weaponToUpdate.setWeapon_name(weapon.getWeapon_name());
        weaponToUpdate.setDamage(weapon.getDamage());
        weaponRepository.save(weaponToUpdate);
    }

    @DeleteMapping("/weapon/{id}")
    public void deleteWeapon(@PathVariable int id) {
        weaponRepository.deleteById(id);
    }

    @PostMapping("/buff")
    public void createBuff(@RequestBody Buff buff) {
        buffRepository.save(buff);
    }

    @GetMapping("/buff")
    public Iterable<Buff> getBuff() {
        return buffRepository.findAll();
    }

    @GetMapping("/buff/{id}")
    public Buff getBuffById(@PathVariable int id) {
        return buffRepository.findById(id).get();
    }

    @PutMapping("/buff/{id}")
    public void updateBuff(@PathVariable int id, @RequestBody Buff buff) {
        Buff buffToUpdate = buffRepository.findById(id).get();
        buffToUpdate.setBuff_name(buff.getBuff_name());
        buffToUpdate.setBuff_level(buff.getBuff_level());
        buffRepository.save(buffToUpdate);
    }

    @DeleteMapping("/buff/{id}")
    public void deleteBuff(@PathVariable int id) {
        buffRepository.deleteById(id);
    }
}
