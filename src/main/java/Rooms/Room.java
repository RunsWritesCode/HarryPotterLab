package Rooms;
import MagicalCreatures.MagicalCreature;
import Players.Player;

import java.util.ArrayList;

public abstract class Room {

    public ArrayList<Player> players;
    private String roomName;
    ArrayList<MagicalCreature> magicalCreatures;
    public Horcrux horcrux;

    public Room(ArrayList<Player> players, String roomName, ArrayList<MagicalCreature> magicalCreatures, Horcrux horcrux) {
        this.players = players;
        this.roomName = roomName;
        this.magicalCreatures = magicalCreatures;
        this.horcrux = horcrux;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public ArrayList<MagicalCreature> getMagicalCreatures() {
        return magicalCreatures;
    }

    public void setMagicalCreatures(ArrayList<MagicalCreature> magicalCreatures) {
        this.magicalCreatures = magicalCreatures;
    }

    public Horcrux getHorcrux() {
        return horcrux;
    }

    public void setHorcrux(Horcrux horcrux) {
        this.horcrux = horcrux;
    }
}
