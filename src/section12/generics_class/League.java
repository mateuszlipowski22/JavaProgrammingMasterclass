package section12.generics_class;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    public String name;

    ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the league");
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " is add to the league");
            return true;
        }
    }

    public void displayLeagueTable() {
        Collections.sort(teams);
        System.out.printf("%15S | %20S | %10S %n", "position", "Team name", "Points");
        for (int i = 0; i < teams.size(); i++) {
            System.out.printf("%15d | %20S | %10S %n", i+1, teams.get(i).getName(), teams.get(i).ranking());

        }
    }

}

