public class Water extends Obstacles{
    int water;
    public Water(int water){
        this.water=water;
    }
    @Override
    public boolean doIt(Team obj){
        if (this.water<obj.maxSwim){
            System.out.print("переплыл, ");
            return (true);}
        else{
            System.out.print("не переплыл, ");
            return (false);}
    }
}
