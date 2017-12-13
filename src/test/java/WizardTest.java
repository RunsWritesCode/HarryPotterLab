import MagicalCreatures.Basilisk;
import Players.Aurors.Spell;
import Players.Aurors.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Basilisk basilisk;

    @Before
    public void before() {
        wizard = new Wizard(160, 40, "phoenix core", Spell.STUPIFY, "HARRY");
        basilisk = new Basilisk(180, 100);
    }


    @Test
    public void canTakeDamage() {
        basilisk.damageAuror(wizard);
        assertEquals(60, wizard.getHealthValue());
    }
}
