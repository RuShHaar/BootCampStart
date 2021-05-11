package IronHackRPG;

public class Warrior extends Character{

    private int stamina;
    private int strength;

    public Warrior(int id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        setStamina(stamina);
        setStrength(strength);
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getPlayerDetails(){
        String playerDetails = super.getPlayerDetails();
        return playerDetails + ", Stamina: " + this.stamina + ", Strength: " + this.strength;
    }
}
