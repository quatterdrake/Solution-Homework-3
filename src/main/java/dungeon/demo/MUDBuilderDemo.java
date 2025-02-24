package dungeon.demo;

import dungeon.builder.Dungeon;
import dungeon.builder.SimpleDungeonBuilder;
import dungeon.prototype.NPC;
import dungeon.prototype.Room;

public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Mystic Dungeon")
                .addRoom(new Room("Entrance", "The main entrance of the dungeon."))
                .addRoom(new Room("Treasure Room", "A room filled with gold and jewels."))
                .addNPC(new NPC("Goblin", "Guard"))
                .addNPC(new NPC("Dragon", "Boss"))
                .build();

        dungeon.showDungeonInfo();
    }
}
