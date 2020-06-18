public class Team {
    int maxRun;
    int maxSwim;
    int maxJump;
    boolean onDistance;
    String name;
    String type;
    public Team(String name, String type, int maxRun, int maxJump, int maxSwim, boolean onDistance){
        this.name=name;
        this.type=type;
        this.maxRun=maxRun;
        this.maxJump=maxJump;
        this.maxSwim=maxSwim;
        this.onDistance=onDistance;
    }
    public void info(Team[] team){
        for (int i=0;i<team.length;i++)
        System.out.println(team[i].name+" "+team[i].type+" "+team[i].maxRun+" "+team[i].maxSwim+" "+team[i].maxJump+" "+team[i].onDistance);
    }
}
