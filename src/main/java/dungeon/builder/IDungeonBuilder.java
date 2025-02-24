package dungeon.builder;

import dungeon.prototype.NPC;
import dungeon.prototype.Room;

public interface IDungeonBuilder {
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    IDungeonBuilder setRoomPrototype(Room prototype);
    IDungeonBuilder cloneRoom(int count);
    Dungeon build();
}
