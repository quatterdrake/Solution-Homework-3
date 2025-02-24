package dungeon.prototype;

public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new Room(this.name, this.description);
    }

    @Override
    public String toString() {
        return name + ": " + description;
    }
}
