package Party;

import java.util.UUID;

public record Note(
        UUID characterID,
        UUID evidenceID,
        UUID locationID
) {}
