package IronHackRPG;

public class Main {

    public static void main(String[] args) {

        Character player1 = new Warrior(1234, "MasterChief", 150, true, 200, 500);

        System.out.println(player1.getPlayerDetails());

    }
}
