package Control;

public class ComboItem {

    private int id;
    private String description;

    public ComboItem(int id, String description) {
        this.id = id;
        this.description = description.trim();
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}
