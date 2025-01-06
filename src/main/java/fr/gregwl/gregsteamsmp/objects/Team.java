package fr.gregwl.gregsteamsmp.objects;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.UUID;

public class Team {
    private String teamName;
    private int nbmembers;
    private String owner;
    private ArrayList<String> members;

    public Team(String teamName, int nbmembers, String owner, ArrayList<String> members) {
        this.teamName = teamName;
        this.nbmembers = nbmembers;
        this.owner = owner;
        this.members = members;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getNbmembers() {
        return nbmembers;
    }

    public String getOwner() {
        return owner;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public void setNbmembers(int nbmembers) {
        this.nbmembers = nbmembers;
    }
}
