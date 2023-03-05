package reflections;

public class Footballer {
    private int age;
    private String name;
    private int goals;
    private int matchesPlayed;
    private String league;
    private String team;

    public int calculateRating() {
        return goals / age;
    }

    public int getAge() {
        return age;
    }

    public Footballer(int age, String name, int goals, int matchesPlayed, String league, String team) {
        this.age = age;
        this.name = name;
        this.goals = goals;
        this.matchesPlayed = matchesPlayed;
        this.league = league;
        this.team = team;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + goals;
        result = prime * result + matchesPlayed;
        result = prime * result + ((league == null) ? 0 : league.hashCode());
        result = prime * result + ((team == null) ? 0 : team.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Footballer other = (Footballer) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (goals != other.goals)
            return false;
        if (matchesPlayed != other.matchesPlayed)
            return false;
        if (league == null) {
            if (other.league != null)
                return false;
        } else if (!league.equals(other.league))
            return false;
        if (team == null) {
            if (other.team != null)
                return false;
        } else if (!team.equals(other.team))
            return false;
        return true;
    }

}
