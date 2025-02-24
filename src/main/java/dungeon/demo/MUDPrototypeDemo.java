package dungeon.demo;

import dungeon.prototype.NPC;
import dungeon.prototype.Room;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Dark Hall", "A long, shadowy corridor.");
        NPC prototypeNPC = new NPC("Skeleton Warrior", "Guard");

        Room clonedRoom1 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom2 = (Room) prototypeRoom.cloneEntity();

        NPC clonedNPC1 = (NPC) prototypeNPC.cloneEntity();
        NPC clonedNPC2 = (NPC) prototypeNPC.cloneEntity();

        System.out.println("🟢 Original Room: " + prototypeRoom);
        System.out.println("🟢 Cloned Room 1: " + clonedRoom1);
        System.out.println("🟢 Cloned Room 2: " + clonedRoom2);

        System.out.println("\n🟡 Original NPC: " + prototypeNPC);
        System.out.println("🟡 Cloned NPC 1: " + clonedNPC1);
        System.out.println("🟡 Cloned NPC 2: " + clonedNPC2);
    }
}
