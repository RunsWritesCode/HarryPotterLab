package MagicalCreatures;

import Players.IAttack;
import Players.IDamage;

public class Elf extends MagicalCreature implements IAttack, IDamage {
    private String name;
    private Boolean loyalty;

    public Elf(int healthValue, int attackValue, String name, Boolean loyalty) {
        super(healthValue, attackValue);
        this.name = name;
        this.loyalty = loyalty;
    }
}
