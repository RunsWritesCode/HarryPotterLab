package Players.Healers;

import Players.Aurors.Wizard;

public abstract class Healer implements IHeal {

    private Potion potion;
    private Herb herb;
    private int healPower;

    public Healer(Potion potion, Herb herb, int healPower) {
        this.potion = potion;
        this.herb = herb;
        this.healPower = healPower;
    }

    public int heal(int healPower) {
        return healPower;
    }

}
