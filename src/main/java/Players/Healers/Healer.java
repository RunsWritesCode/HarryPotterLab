package Players.Healers;

public abstract class Healer {

    private Potion potion;
    private Herb herb;
    private int healPower;

    public Healer(Potion potion, Herb herb, int healPower) {
        this.potion = potion;
        this.herb = herb;
        this.healPower = healPower;
    }

}
