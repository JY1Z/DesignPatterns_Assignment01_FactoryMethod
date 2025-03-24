public class WaterTile extends Tile {
    public char getCharacter() { return 'W'; }
    public String getType() { return "water"; }

    public void action() {
        System.out.println("Water action...");
    }
}