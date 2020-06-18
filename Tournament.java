public class Tournament {
    public void tournament(Team[] team, Obstacles[] obstacles){
        for (int i=0;i<team.length;i++) {
            System.out.print(team[i].name+" ");
            for (int j = 0; j < obstacles.length; j++)
                obstacles[j].doIt(team[i]);
            System.out.println();
        }
    }
}
