package Party;

import Party.Scene.Character.Character;
import Party.Scene.Evidence;
import Party.Scene.Location;
import Party.Scene.Scene;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private final List<Location> locations;
    private final List<Evidence> evidences;
    private final List<Character> characters;
    private final List<Scene> scenes;
    private final Note solution;
    private final Detective detective;

    public Party(
            List<Location> locations,
            List<Evidence> evidences,
            List<Character> characters,
            List<Scene> scenes,
            Note solution,
            Detective detective
    ) {
        this.locations = locations;
        this.evidences = evidences;
        this.characters = characters;
        this.scenes = scenes;
        this.solution = solution;
        this.detective = detective;
    }

    public List<Scene> getVisibleScenes() {
        List<Scene> visibleScenes = new ArrayList<>();
        for (Scene scene : scenes) {
            if (isSceneVisible(scene)) {
                visibleScenes.add(scene);
            }
        }
        return visibleScenes;
    }

    private boolean isSceneVisible(Scene scene) {

    }
}
