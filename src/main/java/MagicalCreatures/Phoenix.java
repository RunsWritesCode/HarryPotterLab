package MagicalCreatures;




public class Phoenix extends MagicalCreature {

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
