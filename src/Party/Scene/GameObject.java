package Party.Scene;

import java.nio.file.Path;
import java.util.UUID;

public class GameObject {
    public final UUID id;
    public final String name;
    public final Path picturePath;
    public final String description;

    public GameObject(String name, Path picturePath, String description) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.picturePath = picturePath;
        this.description = description;
    }
}
