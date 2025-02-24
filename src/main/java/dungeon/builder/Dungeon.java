package dungeon.builder;

import dungeon.prototype.NPC;
import dungeon.prototype.Room;
import java.util.List;

public class Dungeon {
    private String name;
    private List<Room> rooms;
    private List<NPC> npcs;

    public Dungeon(String name, List<Room> rooms, List<NPC> npcs) {
        this.name = name;
        this.rooms = rooms;
        this.npcs = npcs;
    }

    public void showDungeonInfo() {
        System.out.println("\n🏰 Dungeon Name: " + name);

        System.out.println("\n🚪 Rooms:");
        for (Room room : rooms) {
            System.out.println(" - " + room);
        }

        System.out.println("\n🧙 NPCs:");
        for (NPC npc : npcs) {
            System.out.println(" - " + npc);
        }
    }
}
