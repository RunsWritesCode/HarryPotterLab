package Players.Healers;

public enum Potion {

    POLYJUICE(60, "Polyjuice"),
    FELIXFELICIS(100, "Felixfelicis");


    private int value;
    private String name;

    Potion(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
