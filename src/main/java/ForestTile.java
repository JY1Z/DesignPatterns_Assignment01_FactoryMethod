public class ForestTile extends Tile {
    public char getCharacter() { return 'F'; }
    public String getType() { return "forest"; }

    @Override
    public void action() {
        System.out.println("Forest action...");
    }
}