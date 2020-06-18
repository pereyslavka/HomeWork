public class Human extends Team{
    public Human(String name){
        super(name, "Human", 1000, 2, 1000, true);
    }
    public Human(String name, int swim){
        super(name, "Human", 1000, 2, swim, true);
    }
}
