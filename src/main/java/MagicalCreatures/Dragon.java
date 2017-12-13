package MagicalCreatures;

import Players.IAttack;
import Players.IDamage;

public class Dragon extends MagicalCreature implements IAttack, IDamage {


    public Dragon(int healthValue, int attackValue) {
        super(healthValue, attackValue);
    }



}
