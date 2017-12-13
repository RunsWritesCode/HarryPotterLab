package Players.Aurors;

import MagicalCreatures.Basilisk;
import Players.IAttack;
import Players.IDamage;


public abstract class Auror implements IAttack, IDamage {
    private int healthValue;
    private int attackValue;
    private String wandType;
    private Spell spell;
    private String name;

    public Auror(int healthValue, int attackValue, String wandType, Spell spell, String name) {
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.wandType = wandType;
        this.spell = spell;
        this.name = name;
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

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void takeDamage(int attack){
        this.healthValue -= attack;
    }

    public void damageCreature(Basilisk basilisk) {
        basilisk.takeDamage(40);
    }


}
