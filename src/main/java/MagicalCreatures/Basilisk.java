package MagicalCreatures;

import Players.IAttack;
import Players.IDamage;

public class Basilisk extends MagicalCreature implements IAttack, IDamage {
    public Basilisk(int healthValue, int attackValue) {
        super(healthValue, attackValue);
    }
}
