package Players.Aurors;

import Players.IAttack;
import Players.IDamage;

public class Wizard extends Auror implements IAttack, IDamage {
    public Wizard(int healthValue, int attackValue, String wandType, Spell spell, String name) {
        super(healthValue, attackValue, wandType, spell, name);
    }


}
