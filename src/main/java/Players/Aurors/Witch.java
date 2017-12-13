package Players.Aurors;

import Players.IAttack;
import Players.IDamage;


public class Witch extends Auror implements IAttack, IDamage {

    public Witch(int healthValue, int attackValue, String wandType, Spell spell, String name) {
        super(healthValue, attackValue, wandType, spell, name);
    }


    public int heal(int healPower) {
        return 100;
    }
}
