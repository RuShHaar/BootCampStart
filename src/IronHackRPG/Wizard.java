package IronHackRPG;

public class Wizard extends Character {

    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
}
