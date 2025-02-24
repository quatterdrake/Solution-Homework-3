package dungeon.prototype;

public class NPC implements CloneableGameEntity {
    private String name;
    private String role;

    public NPC(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new NPC(this.name, this.role);
    }

    @Override
    public String toString() {
        return name + " (" + role + ")";
    }
}
