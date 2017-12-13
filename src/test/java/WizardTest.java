import MagicalCreatures.Basilisk;
import Players.Aurors.Spell;
import Players.Aurors.Wizard;
import Players.Healers.Herb;
import Players.Healers.Potion;
import Players.Healers.StMungosHealer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Basilisk basilisk;
    StMungosHealer stMungosHealer;

    @Before
    public void before() {
        wizard = new Wizard(160, 40, "phoenix core", Spell.STUPIFY, "HARRY");
        basilisk = new Basilisk(180, 100);
        stMungosHealer = new StMungosHealer(Potion.POLYJUICE, Herb.GILLYWEED, 100);
    }


    @Test
    public void canTakeDamage() {
        basilisk.damageAuror(wizard);
        assertEquals(60, wizard.getHealthValue());
    }



}
