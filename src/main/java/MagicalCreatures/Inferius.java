package MagicalCreatures;

import Players.IAttack;
import Players.IDamage;

public class Inferius extends MagicalCreature implements IAttack, IDamage {
    public Inferius(int healthValue, int attackValue) {
        super(healthValue, attackValue);
    }
}
