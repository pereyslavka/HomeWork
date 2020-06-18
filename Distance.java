public class Distance extends Obstacles{
    int distance;
    public Distance(int distance){
        this.distance=distance;
    }
    @Override
    public boolean doIt(Team obj){
        if (this.distance<obj.maxRun){
            System.out.print("пробежал, ");
            return (true);}
        else{
            System.out.print("не пробежал, ");
            return (false);}
    }
}
