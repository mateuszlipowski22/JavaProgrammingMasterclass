package section12.generics_class;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cups");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this will not work");
        brokenTeam.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<FootballPlayer> melbourn = new Team<>("Melbourn");
        FootballPlayer banksy = new FootballPlayer("Banksy");
        melbourn.addPlayer(banksy);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 3, 1);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
//        adelaideCrows.matchResult(baseballTeam, 1, 1);
    }

}
