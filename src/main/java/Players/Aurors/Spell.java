package Players.Aurors;

public enum Spell {

    EXPECTOPATRONUM(50, "Expectopatronum"),
    AVADAKADAVRA(100, "Avadakadavra"),
    STUPIFY(25, "Stupify"),
    EXPELLIARMUS(10, "Expelliarmus"),
    CONFRINGO(80, "Confringo");

    private int value;
    private String name;

    Spell(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
