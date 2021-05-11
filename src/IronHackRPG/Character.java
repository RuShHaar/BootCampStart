package IronHackRPG;

public class Character {

    private int id;
    private String name;
    private int hp;
    private boolean isAlive;

    protected Character(int id, String name, int hp, boolean isAlive){
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public int getHp() {
        return this.hp;
    }

    public int getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String getPlayerDetails(){
        return "Name: " + this.name + ", HP: " + this.hp;
    }
}
