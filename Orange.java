public class Orange extends Fruit {
    public Orange(){
        weight = 1.5f;
    }

    @Override
    public Fruit addfruit() {
        return new Orange();
    }
}
