import MagicalCreatures.Basilisk;
import Players.Aurors.Spell;
import Players.Aurors.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasiliskTest {

    Basilisk basilisk;
    Wizard wizard;

    @Before
    public void before() {
        basilisk = new Basilisk(180, 100);
        wizard = new Wizard(160, 40, "phoenix core", Spell.STUPIFY, "HARRY");
    }

    @Test
    public void canTakeDamage() {
        wizard.damageCreature(basilisk);
        assertEquals(140, basilisk.getHealthValue());
    }

}
