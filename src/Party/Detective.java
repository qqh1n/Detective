package Party;

import java.util.LinkedList;
import java.util.List;

public class Detective {
    private final String name;
    private final List<Note> journal;

    public Detective(String name) {
        this.name = name;
        this.journal = new LinkedList<>();
    }

    public String getName() {
        return this.name;
    }

    public List<Note> getJournal() {
        return this.journal;
    }
}
