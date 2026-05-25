package Party.Scene.Character;

import Party.Scene.Character.References.GameObjectRef;
import Party.Scene.Character.References.LocationRef;

import java.util.Set;
import java.util.UUID;

public class KnowledgeSet {
    private final Set<UUID> locationsIDSet;
    private final Set<UUID> charactersIDSet;
    private final Set<UUID> evidencesDSet;

    public KnowledgeSet(
            Set<LocationRef> locationsIDSet,
            Set<> charactersIDSet,
            Set<UUID> evidencesDSet
    ) {
        this.locationsIDSet = locationsIDSet;
        this.charactersIDSet = charactersIDSet;
        this.evidencesDSet = evidencesDSet;
    }

    public boolean knows(GameObjectRef gameObjectRef) {

    }
}
