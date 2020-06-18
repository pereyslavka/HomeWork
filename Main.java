public class Main {
    public static void main(String[] args) {
        Team[] team={new Human("Вася"), new Cat("Мурзик"), new Dog("Шарик"), new Human("Петя", 200)};
        Obstacles[] stadium={new Distance(200), new Wall(1), new Water(100), new Distance(700), new Water(300)};
        stadium[0].tournament(team, stadium);
        team[0].info(team);
    }
}
