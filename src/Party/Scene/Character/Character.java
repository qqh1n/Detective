package Party.Scene.Character;

import Party.Scene.GameObject;

import java.nio.file.Path;

public class Character extends GameObject {
    private final KnowledgeSet knowledgeSet;
    private final DialogGraph dialogGraph;

    public Character(
            String nick, Path picturePath,
            String description, KnowledgeSet knowledgeSet,
            DialogGraph dialogGraph) {
        super(nick, picturePath, description);
        this.knowledgeSet = knowledgeSet;
        this.dialogGraph = dialogGraph;
    }
}
