package MagicalCreatures;

import Players.Aurors.Wizard;
import Players.IAttack;
import Players.IDamage;

public abstract class MagicalCreature implements IAttack, IDamage {

    private int healthValue;
    private int attackValue;

    public MagicalCreature(int healthValue, int attackvalue) {
        this.healthValue = healthValue;
        this.attackValue = attackvalue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        this.healthValue = healthValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    public void takeDamage(int attack){
        this.healthValue -= attack;
    }

    public void damageAuror(Wizard wizard) {
        wizard.takeDamage(100);}
}
