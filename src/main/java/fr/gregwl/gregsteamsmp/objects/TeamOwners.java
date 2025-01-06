package fr.gregwl.gregsteamsmp.objects;

import java.util.HashMap;
import java.util.UUID;

public class TeamOwners {

    HashMap<String, String> TeamsOwners = new HashMap<>();

    public TeamOwners(HashMap<String, String> teamsOwners) {
        TeamsOwners = teamsOwners;
    }

    public HashMap<String, String> getTeamsOwners() {
        return TeamsOwners;
    }



}
