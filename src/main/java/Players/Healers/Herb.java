package Players.Healers;

public enum Herb {

    GILLYWEED(60, "Gillyweed");

    private int value;
    private String name;

    Herb(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
