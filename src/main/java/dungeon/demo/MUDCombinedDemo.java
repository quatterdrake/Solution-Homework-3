package dungeon.demo;

import dungeon.builder.Dungeon;
import dungeon.builder.SimpleDungeonBuilder;
import dungeon.prototype.NPC;
import dungeon.prototype.Room;

public class MUDCombinedDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Dark Chamber", "A mysterious, dimly lit room.");

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dungeon of Shadows")
                .addRoom(new Room("Entrance", "A narrow, stone-covered entrance."))
                .setRoomPrototype(prototypeRoom)
                .cloneRoom(3)
                .addNPC(new NPC("Orc Warrior", "Hostile"))
                .addNPC(new NPC("Dungeon Master", "Neutral"))
                .build();

        dungeon.showDungeonInfo();
    }
}
