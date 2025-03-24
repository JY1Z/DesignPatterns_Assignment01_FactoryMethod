public class BuildingTile extends Tile {
    public char getCharacter() { return 'B'; }
    public String getType() { return "building"; }

    public void action() {
        System.out.println("Building action...");
    }
}