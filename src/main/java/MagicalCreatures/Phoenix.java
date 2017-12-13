package MagicalCreatures;

import Players.Healers.IHeal;


public class Phoenix extends MagicalCreature implements IHeal {

    private int healPower;

    public Phoenix(int healthValue, int attackValue, int healPower) {
        super(healthValue, attackValue);
        this.healPower = healPower;
    }

    public int getHealPower() {
        return healPower;
    }

    public void setHealPower(int healPower) {
        this.healPower = healPower;
    }
}
