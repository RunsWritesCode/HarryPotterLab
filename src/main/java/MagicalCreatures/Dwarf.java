package MagicalCreatures;

import Players.IAttack;
import Players.IDamage;

public class Dwarf extends MagicalCreature implements IAttack, IDamage {
    private String name;


    public Dwarf(int healthValue, int attackValue, String name) {
        super(healthValue, attackValue);
        this.name = name;
    }
}
