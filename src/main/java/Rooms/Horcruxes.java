package Rooms;

enum Horcrux {
    RIDDLESDIARY(1, "Riddle's Diary"),
    HUFFLEPUFFSCUP(3, "Hufflepuff's Cup");

    private int value;
    private String name;

    Horcrux(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
