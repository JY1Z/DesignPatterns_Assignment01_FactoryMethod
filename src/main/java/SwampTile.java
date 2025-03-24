public class SwampTile extends Tile {
    public char getCharacter() { return 'S'; }
    public String getType() { return "swamp"; }

    @Override
    public void action() {
        System.out.println("Swamp action...");
    }
}