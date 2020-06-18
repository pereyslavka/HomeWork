public class Wall extends Obstacles{
    int wall;
    public Wall(int wall){
        this.wall=wall;
    }
    @Override
    public boolean doIt(Team obj){
        if (this.wall<obj.maxJump) {
            System.out.print("перепрыгнул, ");
            return (true); }
        else {
            System.out.print("не перепрыгнул, ");
            return (false); }
    }

}
