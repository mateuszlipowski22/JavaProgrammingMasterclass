package section12.generics_17;

interface Player{
    String name();
}

record BaseballPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}
record VolleyballPlayer(String name, String position) implements Player {}

public class Main {

    public static void main(String[] args) {

        var philly = new Affiliation("city", "Philadelphia, PA", "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Philles");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Philles");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philadelphia Philles", philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows", "City of Adelaide, South Australia, in AU");
        var tex = new FootballPlayer("Tex Walker", "Center half forward");
        afc.addTeamMember(tex);

        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

//        Team<Integer> melbournVB = new Team<>("Melbourne Vipers");
    }

    public static void scoreResult(BaseballTeam team1, int score1,
                                   BaseballTeam team2, int score2){
        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int score1,
                                   SportsTeam team2, int score2){
        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int score1,
                                   Team team2, int score2){
        String message = team1.setScore(score1, score2);
        team2.setScore(score2, score1);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

}
