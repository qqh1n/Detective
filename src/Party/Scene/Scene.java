package Party.Scene;

import java.util.UUID;

public class Scene {
    public final UUID characterID;
    public final UUID evidenceID;
    public final UUID locationID;
    public boolean discovered;

    public Scene(UUID characterID, UUID evidenceID, UUID locationID) {
        this.characterID = characterID;
        this.evidenceID = evidenceID;
        this.locationID = locationID;
        discovered = false;
    }

}
