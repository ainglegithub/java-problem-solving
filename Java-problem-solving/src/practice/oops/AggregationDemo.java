package practice.oops;


import java.util.List;

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Team {
    private String teamName;
    private List<Player> players; // Aggregation: Team has Players

    // Players are created outside and passed in
    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public void printTeamMembers() {
        System.out.println("Team " + teamName + " Players:");
        for (Player p : players) {
            System.out.println("- " + p.getName());
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Player p1 = new Player("Messi");
        Player p2 = new Player("Ronaldo");

        List<Player> playerList = List.of(p1, p2);

        Team team = new Team("All-Stars", playerList);
        team.printTeamMembers();

        // Destroying the team reference
        team = null;

        // Players still exist independently!
        System.out.println("\nAfter Team deletion, Player 1 is still: " + p1.getName());
    }
}