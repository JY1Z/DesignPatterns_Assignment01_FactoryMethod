public class RoadTile extends Tile {
    public char getCharacter() { return 'R'; }
    public String getType() { return "road"; }

    @Override
    public void action() {
        System.out.println("Road action...");
    }
}