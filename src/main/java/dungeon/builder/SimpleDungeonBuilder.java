package dungeon.builder;

import dungeon.prototype.NPC;
import dungeon.prototype.Room;
import java.util.ArrayList;
import java.util.List;

public class SimpleDungeonBuilder implements IDungeonBuilder {
    private String name;
    private List<Room> rooms = new ArrayList<>();
    private List<NPC> npcs = new ArrayList<>();
    private Room roomPrototype;

    @Override
    public IDungeonBuilder setDungeonName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public IDungeonBuilder addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    @Override
    public IDungeonBuilder addNPC(NPC npc) {
        npcs.add(npc);
        return this;
    }

    @Override
    public IDungeonBuilder setRoomPrototype(Room prototype) {
        this.roomPrototype = prototype;
        return this;
    }

    @Override
    public IDungeonBuilder cloneRoom(int count) {
        if (roomPrototype != null) {
            for (int i = 1; i <= count; i++) {
                Room clonedRoom = (Room) roomPrototype.cloneEntity();
                clonedRoom.setName(clonedRoom.getName() + " Clone #" + i);
                rooms.add(clonedRoom);
            }
        }
        return this;
    }

    @Override
    public Dungeon build() {
        return new Dungeon(name, rooms, npcs);
    }
}
