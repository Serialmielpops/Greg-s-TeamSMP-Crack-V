package fr.gregwl.gregsteamsmp.objects;

import java.util.HashMap;
import java.util.UUID;

public class PlayerList {

    HashMap<String, String> playerList = new HashMap<>();

    public PlayerList(HashMap<String, String> playerList) {
        this.playerList = playerList;
    }

    public HashMap<String, String> getPlayerList() {
        return playerList;
    }
}

