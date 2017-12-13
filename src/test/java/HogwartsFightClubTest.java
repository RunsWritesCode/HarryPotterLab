import MagicalCreatures.Basilisk;
import MagicalCreatures.Elf;
import MagicalCreatures.MagicalCreature;
import Players.Aurors.Spell;
import Players.Aurors.Wizard;
import Players.Healers.Herb;
import Players.Healers.Potion;
import Players.Healers.StMungosHealer;
import Players.Player;
import Rooms.Horcrux;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HogwartsFightClubTest {

    Wizard wizard;
    Basilisk basilisk;
    Elf elf;
    StMungosHealer stMungosHealer;
    Room room;
    ArrayList<Player> players;
    ArrayList<MagicalCreature> magicalCreatures;


    @Before
    public void before() {
        wizard = new Wizard(160, 40, "phoenix core", Spell.STUPIFY, "HARRY");
        basilisk = new Basilisk(180, 100);
        stMungosHealer = new StMungosHealer(Potion.POLYJUICE, Herb.GILLYWEED, 100);
        players = new ArrayList<>();
        magicalCreatures = new ArrayList<>();

        room = new Room(players, "Chamber of Secrets", magicalCreatures, Horcrux.RIDDLESDIARY);

    }

    @Test
    public void roomHasPlayers() {
        assertEquals(1, players.size());
    }

}
