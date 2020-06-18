public abstract class Obstacles{
    public abstract boolean doIt(Team obj);

    public void tournament(Team[] team, Obstacles[] obstacles){
        for (int i=0;i<team.length;i++) {
            System.out.print(team[i].name+" ");
            for (int j = 0; j < obstacles.length; j++){
                team[i].onDistance=obstacles[j].doIt(team[i]);
                if (team[i].onDistance==false)
                    break;}
            System.out.println();
        }
    }
}
